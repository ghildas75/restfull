 package ca.ghildas.entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
@Entity
public class Department  implements Serializable{
@Override
	public String toString() {
		return "Department [numDep=" + numDep + ", nameDep=" + nameDep + ", students=" + students + "]";
	}

@Id
@GeneratedValue
private int numDep;
@NotNull
private String nameDep;
@OneToMany(mappedBy="department")
private Collection<Student> students;

public int getNumDep() {
	return numDep;
}

public void setNumDep(int numDep) {
	this.numDep = numDep;
}

public String getNameDep() {
	return nameDep;
}

public void setNameDep(String nameDep) {
	this.nameDep = nameDep;
}

public Collection<Student> getStudents() {
	return students;
}

public void setStudents(Collection<Student> students) {
	this.students = students;
}

public Department() {
	
}

public Department( String nameDep) {
	
	this.nameDep = nameDep;

}

public Department(int numDep, String nameDep) {
	super();
	this.numDep = numDep;
	this.nameDep = nameDep;
}



}
