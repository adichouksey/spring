package com.capg.entities;

public class Employee {
    private Integer empId;
    private String empName;
    private int empSalary;
  

   

	public Employee(){

    }

    public Employee(int empId, String empName,int empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;
    }

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
    
    
    
    
}
