package ca.ghildas.metier;

import java.util.List;

import ca.ghildas.entity.Department;
import ca.ghildas.entity.Student;

public interface IRestFullMetier {
	public List<Student>  getAllStudent() ;
	public int addStudent(Student s, int numDep);
	public List<Student> getAllStudentByIdDepartment(int numDep);
	public void addStudentToDepbyId(int numStud,Department dept);
	public void suppStudentsbyNumDep(int numDep);

	public void addDepartment(Department dept);
	public List<Department> getAllDepartment();
}

