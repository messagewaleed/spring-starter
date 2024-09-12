package com.socgen.waleed.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        Engineer engineer =  new Engineer();
//        engineer.workForWages();
    	
//    	1. Load the context
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	
//    	2. Get a reference to the bean
    	Engineer engineer = context.getBean("engineer", Engineer.class);
    	
//    	3. Call methods on the bean
    	engineer.workForWages();
    	
    	
    	
    	
    	
    	
    }
}
