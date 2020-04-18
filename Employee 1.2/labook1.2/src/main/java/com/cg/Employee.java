package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private SBU sbu;
	
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
	
	
	
	public SBU getSbu() {
		return sbu;
	}

	@Autowired
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	
	public void sbudisplay() {
		System.out.println("SBU Details------------------------------");
		System.out.println("SBU ID: "+this.getSbu().getSbuId()+ " "+"SBU Name: "+this.getSbu().getSbuName()+
				" "+"SBU HEAD:" +this.getSbu().getSbuHead());
	}
	

	public void display() {
		System.out.println("Employee Details------------------------------");
		System.out.println("Employee ID: "+this.getEmpId()+ " "+"Employee Name: "+this.getEmpName()+
				" "+"Employee Salary:" +this.getEmpSalary()+" "+" Employee Age:"+this.getEmpAge()+
				" "+"Employee Bu: "+this.getEmpBu());
	
	

	
	
	}
}