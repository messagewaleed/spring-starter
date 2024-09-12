package com.socgen.waleed.training;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class App 
{
    public static void main( String[] args )
    {
//        Engineer engineer =  new Engineer();
//        engineer.workForWages();
    	
//    	1. Load the context
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationsConfig.xml");
    	
//    	2. Get a reference to the bean
    	//Engineer engineer = context.getBean("engineer", Engineer.class);
    	
//    	3. Call methods on the bean
    	//engineer.workForWages();
    	
    	
//    	ComputerEnginner computerEnginner = context.getBean("computerEngineer", ComputerEnginner.class);
//    	
//    	computerEnginner.work();
    	
    	AnnotationsEngineer engineer = context.getBean("anEngineer", AnnotationsEngineer.class);
    	
    	engineer.workForWages();
    	 	
    }
    
    
    @Bean
    List<String> getNames() {
    	return new LinkedList<String>(Arrays.asList(
    			"Anand", "Sneha", "Shreya", "Pranav"
    			));
    }
    
    
    
}
