package com.springboot.Springbootdatabaseop.entity;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name="customeraddress")
public class CustomerAddress implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	@Column(length = 11)
	private int customerid;
	@Column(length = 55)
	private String city;  
	@Column(length = 55)
	private String state;
	@Column(length = 55)
	private String country;
	@Column(length = 25)
	private String pin;
	@CreatedDate
	private LocalTime createddate;
	@Override
	public String toString() {
		return "CustomerAddress [id=" + id + ", customerid=" + customerid + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pin=" + pin + ", createddate=" + createddate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public LocalTime getCreateddate() {
		return createddate;
	}
	public void setCreateddate(LocalTime createddate) {
		this.createddate = createddate;
	}
	
	
	
}
