package ca.ghildas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ca.ghildas.entity.Department;
import ca.ghildas.entity.Student;
import ca.ghildas.metier.IRestFullMetier;


@SpringBootApplication
public class RestFullProjetApplication implements CommandLineRunner {

	
	@Autowired
	private IRestFullMetier restMetier;
	public static void main(String[] args) {
		SpringApplication.run(RestFullProjetApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		restMetier.addDepartment(new Department ("Computer Science"));
		restMetier.addDepartment(new Department ("MATHEMATICAL"));
		restMetier.addDepartment(new Department ("Big Data"));
		DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
		restMetier.addStudent(new Student("Jennifer", "Jackson", df.parse("1984-04-05"), "jenniferjackson@bonheur.ca"), 1);
		restMetier.addStudent(new Student("Zidane", "Zizou", df.parse("1970-04-05"), "zidanezizou@bonheur.ca"), 1);
		restMetier.addStudent(new Student("HATEM", "BENARFA", df.parse("1987-04-05"), "hatembenarfa@bonheur.ca"), 1);
		restMetier.addStudent(new Student("Karmim", "BENZEAM", df.parse("1987-04-05"), "Karimbenzema@bonheur.ca"), 1);
		restMetier.addStudent(new Student("Albert", "Einstin", df.parse("1925-04-05"), "alberteinstein@math.ca"), 2);
		restMetier.addStudent(new Student("Tales", "therome", df.parse("1937-04-05"), "tales@math.ca"), 2);
		
		List<Student> lst= restMetier.getAllStudent();
		//lst.forEach(s->System.out.println(s));*/
		}
	}

