package ca.ghildas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.ghildas.entity.Department;
import ca.ghildas.metier.IRestFullMetier;

@RestController
@RequestMapping("/api")
public class DepartmentRestServie {

@Autowired
private IRestFullMetier restMetier;
@RequestMapping(value="/departments",method= RequestMethod.GET)
public List<Department> getAllDept(){
	return restMetier.getAllDepartment();
}

@RequestMapping(value="/departments",method= RequestMethod.POST)
public void addDepartment(@RequestBody Department d) {
	
	restMetier.addDepartment(d);
	
}


	
}
