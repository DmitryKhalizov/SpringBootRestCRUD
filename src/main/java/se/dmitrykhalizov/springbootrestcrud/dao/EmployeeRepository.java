package se.dmitrykhalizov.springbootrestcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import se.dmitrykhalizov.springbootrestcrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
