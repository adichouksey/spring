package com.capg;

import com.capg.config.JavaConfig;
import com.capg.entities.Employee;
import com.capg.service.IEmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class EmployeeMain {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
       
        Class configurationClass= JavaConfig.class;
        context.register(configurationClass);
        context.refresh();
        //to load with bean object
        
       
        IEmployeeService service = context.getBean(IEmployeeService.class);
        List<Employee>employees= service.listAllEmployees();
        EmployeeMain employeemain=new EmployeeMain();
      
        employeemain.display(employees);
    }
    
    
    
   public void display(List<Employee> employees)
   {
    for (Employee employee:employees){
    	System.out.println("EMPLOYEE INFO--------------------------------");
        System.out.println("Employee ID :"+employee.getEmpId());
        System.out.println("Employee Name : "+employee.getEmpName());
        System.out.println("Employee Salary :"+employee.getEmpSalary());
    }

}
}