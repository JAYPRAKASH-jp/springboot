package com.springboot.Springbootdatabaseop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Springbootdatabaseop.entity.Customers;

@Repository
public interface CustomersRepo extends JpaRepository<Customers, Integer> {

}
