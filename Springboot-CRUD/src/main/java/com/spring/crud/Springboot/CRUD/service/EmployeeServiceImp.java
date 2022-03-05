package com.spring.crud.Springboot.CRUD.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.Springboot.CRUD.Entity.Employee;
import com.spring.crud.Springboot.CRUD.Repository.EmployeeRepo;

@Transactional
@Service("EmployeeService")
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired EmployeeRepo emprepo;

	@Override
	public Employee saveEmp(Employee emp) {
		// TODO Auto-generated method stub
		return emprepo.save(emp);
	}

	@Override
	public Employee findEmpById(Integer empID) {
		// TODO Auto-generated method stub
		Optional<Employee> userOptional = emprepo.findById(empID);
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        return null;
	}

	@Override
	public List<Employee> findAllEmp() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public Employee updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		return emprepo.save(emp);
	}

	@Override
	public void deleteEmp(int Empid) {
		// TODO Auto-generated method stub
		emprepo.deleteById(Empid);
	}

}
