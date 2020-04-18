package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		Class configClass=JavaConfig.class;
		context.register(configClass);
		context.refresh();
		
		
		
		Employee employee=context.getBean(Employee.class);
		SBU sbu=context.getBean(SBU.class);
		employee.sbudisplay();
		employee.display();
	}
}
