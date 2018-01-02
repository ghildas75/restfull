package ca.ghildas.service;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import ca.ghildas.entity.Department;
import ca.ghildas.entity.Student;
import ca.ghildas.metier.IRestFullMetier;

@RestController
@Service
@RequestMapping("/api")
public class StudentRestService {
@Autowired
private IRestFullMetier restFullMetier;
private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
static Gson gs= new Gson();
//------------ Get ALL STUDENT ------------
@RequestMapping(value="/students", method=RequestMethod.GET,produces ="application/json")
public String getAllStudent() {

	return gs.toJson(restFullMetier.getAllStudent());
}
//------------ Create a  new student ------------
@RequestMapping(value="/students/{numDep}", method=RequestMethod.POST, produces = "application/json")
public void AddStudent(@RequestBody Student st, @PathVariable("numDep")int numDep) {
	
	restFullMetier.addStudent(st, numDep);
}

//------------ Create a  new student ------------
@RequestMapping(value="/students/{numDep}", method=RequestMethod.DELETE, produces = "application/json")
public void SuppStudent( @PathVariable("numDep")int numDep) {
	
	restFullMetier.suppStudentsbyNumDep(numDep);
}
}
