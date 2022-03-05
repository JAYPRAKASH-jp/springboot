package com.spring.crud.Springboot.CRUD.service;

import java.util.List;

import com.spring.crud.Springboot.CRUD.Entity.Employee;

public interface EmployeeService {
	    Employee saveEmp(Employee emp);

	    Employee findEmpById(Integer empID);

	    List<Employee> findAllEmp();

	    Employee updateEmp(Employee emp);

	    void deleteEmp(int Empid);
	
}
