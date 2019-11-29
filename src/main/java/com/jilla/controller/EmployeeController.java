package com.jilla.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jilla.model.Employee;
import com.jilla.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value="employee/{id}", method = RequestMethod.GET)
	public Optional<Employee> getEmployee(@PathVariable String id) {
		return employeeService.findOne(Integer.valueOf(id));		
	}
	
	@RequestMapping(value="employee/create", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp) {
		return employeeService.save(emp);
		
	}
	
	@RequestMapping(value="employee/all", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		return employeeService.findAll();
	}
	
	@RequestMapping(value="employee/modify", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeService.modify(emp);
	}
	
	@RequestMapping(value="employee/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String id){
		employeeService.delete(Integer.valueOf(id));
	}
}
//Controller(Input validation and forwarding the request to the next layer)->Service(Business Logic)->Dao(database operation)
//"employee/all"
//"employee/{id}-->/employee/1
//JSON->Object->@RequestBody
//Object->JSON->@ResponseBody
//browser/postman->application->database
