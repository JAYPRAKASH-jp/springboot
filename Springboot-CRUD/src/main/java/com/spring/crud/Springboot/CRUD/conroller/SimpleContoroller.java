package com.spring.crud.Springboot.CRUD.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.Springboot.CRUD.Entity.Employee;
import com.spring.crud.Springboot.CRUD.models.MessageResponse;
import com.spring.crud.Springboot.CRUD.service.EmployeeService;

@RestController
@RequestMapping
public class SimpleContoroller {
	
	@Autowired EmployeeService empser;
	
	@PostMapping(value = "/emp")
	   public ResponseEntity<?> createNewUser(@RequestBody Employee user) {
	       Employee createdUser = empser.saveEmp(user);
	       return new ResponseEntity<Object>(createdUser, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/emp/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") int userId) {
        Employee user = empser.findEmpById(userId);
        if (user == null) {
            MessageResponse messageResponse = new MessageResponse();
            messageResponse.setMessage("User not found.");
            return new ResponseEntity<Object>(messageResponse, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Object>(user, HttpStatus.OK);
    }
	
    @GetMapping(value = "/emp")
    public ResponseEntity<?> getAllUsers() {
        List<Employee> userList = empser.findAllEmp();
        return new ResponseEntity<Object>(userList, HttpStatus.OK);
    }

    //Update a user based on PUT request.
    

    @PutMapping(value = "/emp/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") int userId, @RequestBody Employee user) {
        user.setId(userId);
        Employee updatedUser = empser.updateEmp(user);
        return new ResponseEntity<Object>(updatedUser, HttpStatus.OK);
    }

    //delete a user based on user ID.
   
    @DeleteMapping(value = "/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") int userId) {
        empser.deleteEmp(userId);
        MessageResponse messageResponse = new MessageResponse();
        messageResponse.setMessage("User has been deleted successfully.");
        return new ResponseEntity<Object>(messageResponse, HttpStatus.OK);
    }
	
	
}
