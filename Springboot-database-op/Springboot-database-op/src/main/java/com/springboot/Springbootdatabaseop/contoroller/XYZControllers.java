package com.springboot.Springbootdatabaseop.contoroller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Springbootdatabaseop.entity.Customers;
import com.springboot.Springbootdatabaseop.service.Customersservice;

@RestController
public class XYZControllers {
		@Autowired Customersservice customersservice;
		
		@PostMapping("/customers")
		public ResponseEntity<Object> postdata(@RequestParam String source,@RequestBody Map<String, Object> body){
			Customers result=customersservice.postData(body);
			return new ResponseEntity<Object>("Data Created Succesfully",HttpStatus.CREATED);
		}
		
		@GetMapping("/customers/{id}")
		public ResponseEntity<Object> postdata(@PathVariable(name="id") int id,@RequestParam String source){
			Optional<Customers> result=customersservice.getdatabyid(id);
			return new ResponseEntity<Object>(result,HttpStatus.OK);
		}
		@GetMapping("/customers")
		public ResponseEntity<Object> getalldata(@RequestParam String source){
			List<Customers> result=customersservice.getAlldatsa();
			return new ResponseEntity<Object>(result,HttpStatus.OK);
		}
		@PutMapping("/customers/{id}")
		public ResponseEntity<Object> getalldata(@PathVariable(name="id") int id,@RequestParam String source,@RequestBody Map<String, Object> body){
			Customers result=customersservice.updatedata(body,id);
			return new ResponseEntity<Object>(result,HttpStatus.OK);
		}
		

}
