package ca.ghildas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.ghildas.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
