package ca.ghildas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ca.ghildas.entity.Student;
import java.util.*;

public interface StudentRepository extends JpaRepository<Student, Integer>{
@Query("select s from Student s where s.department.numDep=:x order by s.birthDate desc")
public List<Student> findAllStudentByDeptId(@Param("x") int numdep);
@Query("select s.firstName  , s.lastName , s.birthDate,s.department.numDep from Student s ")
public List<Student> getStudents();

}
