package ca.ghildas.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ca.ghildas.dao.DepartmentRepository;
import ca.ghildas.dao.StudentRepository;
import ca.ghildas.entity.Department;
import ca.ghildas.entity.Student;

import java.util.*;
@Service
@Transactional

public class RestFullMetier implements IRestFullMetier{
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private DepartmentRepository departmentRepository; 
	@Override
	
	public List<Student>  getAllStudent() {
		return studentRepository.getStudents();

	}
	@Override
	public List<Student> getAllStudentByIdDepartment(int numDep){


		return studentRepository.findAllStudentByDeptId(numDep);

	}

	@Override
	public void addStudentToDepbyId(int numStud,Department dept) {

		Student stud= studentRepository.findOne(numStud);
		dept.getStudents().add(stud);
		departmentRepository.save(dept);
	}
	
	@Override
	public void addDepartment(Department dept) {

		departmentRepository.save(dept);
	}
	@Override
	public int addStudent(Student s, int numDep) {
		// TODO Auto-generated method stub
		Department d=departmentRepository.findOne(numDep);
		s.setDepartment(d);
		studentRepository.save(s);
		return s.getNumStud();
	}
	@Override
	public void suppStudentsbyNumDep(int numDep) {
		// TODO Auto-generated method stub
		Department d=departmentRepository.findOne(numDep);
		Collection<Student> list=new ArrayList<Student>();
		list= d.getStudents();
		list.forEach(s->studentRepository.delete(s));
		/*for (Student student : list) {
			studentRepository.delete(student);
		}*/
	
		departmentRepository.save(d);
	}
	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}
	

}
