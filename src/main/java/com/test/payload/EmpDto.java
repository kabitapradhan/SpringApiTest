package com.test.payload;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class EmpDto {
	
	private long empID;
	
	@NotNull(message="Emp Firstname can not be null")
	@NotEmpty(message="Emp Firstname can not be empty")
	@Size(min=2 , message = "User Firstname must be min 2 length")
	private String empFirstName;
	
	private String empLastName;
	
	@Email(message = "Enter proper email")
	@NotNull(message="Emp email can not be null")
	@NotEmpty(message="Emp email can not be empty")
	private String email;
	
	
	private int phone;
	private Date doj = new Date();
	private int salary;
	public long getEmpID() {
		return empID;
	}
	public void setEmpID(long empID) {
		this.empID = empID;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public EmpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
