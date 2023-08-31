package com.test.payload;



public class EmpDtoTax {
		
	private long empcode;
	private String empFirstName;
	private double yearlySalary;
	private double taxAmount;
	private double cessAmount;
	
	public EmpDtoTax() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpDtoTax(long empcode, String empFirstName, double yearlySalary, double taxAmount, double cessAmount) {
		super();
		this.empcode = empcode;
		this.empFirstName = empFirstName;
		this.yearlySalary = yearlySalary;
		this.taxAmount = taxAmount;
		this.cessAmount = cessAmount;
	}



	public long getEmpcode() {
		return empcode;
	}

	public void setEmpcode(long empcode) {
		this.empcode = empcode;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public double getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getCessAmount() {
		return cessAmount;
	}

	public void setCessAmount(double cessAmount) {
		this.cessAmount = cessAmount;
	}
	
	
	
}
