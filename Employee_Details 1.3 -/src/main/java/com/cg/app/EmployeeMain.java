package com.cg.app;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class EmployeeMain {

    public static void main(String[] args) {
    	
    
    	
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        
        //configuration class is kept
        Class configurationClass=JavaConfig.class;
        context.register(configurationClass);
    
        
        //to get loaded with bean object refreshing is required
        context.refresh();
    
       
     
        SBU sbu=context.getBean(SBU.class);
      sbu.display();
    	
       
    }
    
    
}
