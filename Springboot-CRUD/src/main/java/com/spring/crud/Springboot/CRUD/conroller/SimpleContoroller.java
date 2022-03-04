package com.spring.crud.Springboot.CRUD.conroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleContoroller {
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "nam", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	@RequestMapping("")
	public String hello1(@RequestParam(value = "nam", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
}
