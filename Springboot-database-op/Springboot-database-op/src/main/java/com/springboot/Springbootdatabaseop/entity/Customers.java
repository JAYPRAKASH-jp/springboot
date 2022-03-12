package com.springboot.Springbootdatabaseop.entity;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import com.sun.istack.NotNull;

@Entity
@Table(name="customers")
public class Customers implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11)
	private int id;
	@NotNull
	@Column(length = 55)
	private String name; 
	@NotNull
	@Column(length = 11)
	private int level;
	@NotNull
	@Column(length = 11)
	private String fulladdress;
	@CreatedDate
	private LocalTime createddate;
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	@JoinColumn(name="customerid",referencedColumnName = "id")
	private List<CustomerAddress> customeraddress;
	
	
	
	public List<CustomerAddress> getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(List<CustomerAddress> customeraddress) {
		this.customeraddress = customeraddress;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", level=" + level + ", fulladdress=" + fulladdress
				+ ", timestamp=" + createddate + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getFulladdress() {
		return fulladdress;
	}
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}

	public LocalTime getCreateddate() {
		return createddate;
	}

	public void setCreateddate(LocalTime createddate) {
		this.createddate = createddate;
	}

	
	

}
