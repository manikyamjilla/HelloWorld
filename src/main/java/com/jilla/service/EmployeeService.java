package com.jilla.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jilla.exception.ResourceNotFound;
import com.jilla.model.Employee;
import com.jilla.repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository repository;
	
	/*
	 * static { employees.add(new Employee(1,"Manik", 10000)); employees.add(new
	 * Employee(2,"John", 20000)); }
	 */
	
	public Employee save(Employee employee) {
		return repository.save(employee);
		/*
		 * if(employee.getEmpId()==null) employee.setEmpId(++empCount);
		 * employees.add(employee); return employee;
		 */
	}
	
	public List<Employee> findAll(){
		return repository.findAll();
	}
	
	public Optional<Employee> findOne(Integer id) {
		return repository.findById(id);
		/*
		 * Employee emp =
		 * employees.stream().filter(employee->employee.getEmpId()==id).findAny().orElse
		 * (null); if(emp != null) return emp; else throw new ResourceNotFound(404,
		 * "Employee does not exist");
		 */
	}
	
	public Employee modify(Employee employee) {
		Employee emp = repository.findById(employee.getEmpId()).get();
		emp.setSalary(employee.getSalary());
		return repository.save(emp);
	}
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
//@Component
//@Service
//@Repository
//@Controller
