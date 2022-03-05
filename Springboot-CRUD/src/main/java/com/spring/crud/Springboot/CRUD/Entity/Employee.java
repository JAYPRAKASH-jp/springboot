package com.spring.crud.Springboot.CRUD.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
		@Id
		@Column
		private int id;
		@Column(length=255)
		private String emp_adress;
		@Column(length=255)
		private String emp_name;
		@Column(length=255)
		private String emp_mobile_nos;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmp_adress() {
			return emp_adress;
		}
		public void setEmp_adress(String emp_adress) {
			this.emp_adress = emp_adress;
		}
		public String getEmp_name() {
			return emp_name;
		}
		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}
		public String getEmp_mobile_nos() {
			return emp_mobile_nos;
		}
		public void setEmp_mobile_nos(String emp_mobile_nos) {
			this.emp_mobile_nos = emp_mobile_nos;
		}
		
}
