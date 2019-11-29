package com.jilla.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer empId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="salary")
	private long salary;
	
	

	public Employee() {
	}
	public Employee(Integer empId, String name, long salary) {
		super();
		this.setEmpId(empId);
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}
