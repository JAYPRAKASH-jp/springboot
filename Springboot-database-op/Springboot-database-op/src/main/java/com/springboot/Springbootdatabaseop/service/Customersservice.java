package com.springboot.Springbootdatabaseop.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.Springbootdatabaseop.entity.Customers;
import com.springboot.Springbootdatabaseop.repository.CustomersRepo;

@Service
public class Customersservice {
	
	@Autowired
	CustomersRepo customersrepo;
	
	@Transactional
	public Customers postData(Map<String, Object> body) {
		
		ObjectMapper om=new ObjectMapper();
		Customers data=om.convertValue(body, Customers.class);
		data = customersrepo.save(data);
		return data;
	}
	@Transactional
	public Optional<Customers> getdatabyid(int id) {
		return customersrepo.findById(id);
		
	}
	@Transactional
	public List<Customers> getAlldatsa() {
		return customersrepo.findAll();
		
	}
	@Transactional
	public Customers updatedata(Map<String, Object> body,int id) {
		ObjectMapper om=new ObjectMapper();	
		Optional<Customers> predata = customersrepo.findById(id);
		
		System.out.println("Predata" + predata);
		System.out.println("Body "+ body);
		Map<String,Object> predatainmap=om.convertValue(predata.get(), new TypeReference<Map<String,Object>>(){});
		body.putAll(predatainmap);
		
		System.out.println("PredataMap" + predatainmap);
		Customers data=om.convertValue(predatainmap, Customers.class);
		
		
		data = customersrepo.save(data);
		return data;	
	}

}
