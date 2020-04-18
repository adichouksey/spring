package com.mycompany.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("${empId}")
	private int empId;
	
	@Value("${empName}")
	private String empName;
	
	@Value("${empAge}")
	private int empAge;
	
	@Value("${empSalary}")
	private double empSalary;
	
	@Value("${empBu}")
	private String empBu;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpBu() {
		return empBu;
	}

	public void setEmpBu(String empBu) {
		this.empBu = empBu;
	}
	
	
	public void display() {
		System.out.println("Employee Details------------------------------");
		System.out.println("Employee ID: "+this.getEmpId()+ " "+"Employee Name: "+this.getEmpName()+
				" "+"Employee Salary:" +this.getEmpSalary()+" "+" Employee Age:"+this.getEmpAge()+
				" "+"Employee Bu: "+this.getEmpBu());
	}
}