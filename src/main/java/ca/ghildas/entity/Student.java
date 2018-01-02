 package ca.ghildas.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Student implements Serializable {
@Id
@GeneratedValue
private int numStud;
@NotNull
@Size(min=3, max=30)
private String firstName;
@Override
public String toString() {
	return "Student [numStud=" + numStud + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
			+ birthDate + ", email=" + email + ", department=" + department + "]";
}




@Size(min=3, max=30)
private String  lastName;
@JsonFormat(pattern = "yyyy-MM-dd")
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date birthDate;
@Email
private String email;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="numDep")
private Department department;




public int getNumStud() {
	return numStud;
}




public void setNumStud(int numStud) {
	this.numStud = numStud;
}




public String getFirstName() {
	return firstName;
}




public void setFirstName(String firstName) {
	this.firstName = firstName;
}




public String getLastName() {
	return lastName;
}




public void setLastName(String lastName) {
	this.lastName = lastName;
}




public Date getBirthDate() {
	return birthDate;
}




public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public Department getDepartment() {
	return department;
}




public void setDepartment(Department department) {
	this.department = department;
}




public Student() {
	super();
}




public Student( String firstName, String lastName, Date birthDate, String email) {
	super();

	this.firstName = firstName;
	this.lastName = lastName;
	this.birthDate = birthDate;
	this.email = email;
}




/*@Override
public String toString() {
	return "Student [numStud=" + numStud + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
			+ birthDate + ", email=" + email + "]";
}
*/
}
