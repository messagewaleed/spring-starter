package com.socgen.waleed.training;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Service
//@Controller
//@Repository
@Component("anEngineer") //No bean declarations now in the xml!!!
@PropertySource("classpath:user.properties")
public class AnnotationsEngineer {
	
	@Autowired // 3
	private Laptop laptop;
	
	@Value("${userName}")
	private String userName;
	
	@Value("${userId}")
	private String userId;
	
	@Autowired
	private List<String> names;
	
	public AnnotationsEngineer() {
		// TODO Auto-generated constructor stub
	}

	public Laptop getLaptop() {
		return laptop;
	}

//	@Autowired - 1
//	@Qualifier("otherLaptop") //For the exact match!
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

//	@Autowired - 2
//	public AnnotationsEngineer(@Qualifier("otherLaptop") Laptop laptop) {
//		this.laptop = laptop;
//	}

	@Override
	public String toString() {
		return "AnnotationsEngineer [laptop=" + laptop + "]";
	}

	void workForWages() {
		System.out.println(this);
		System.out.println("My details: ");
		System.out.println(userName + " with id : " + userId);
		System.out.println("Registered names : ");
		names.forEach(System.out::println);
	}
	
	
}
