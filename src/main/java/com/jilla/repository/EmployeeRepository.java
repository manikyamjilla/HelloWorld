package com.jilla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jilla.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
 
}
