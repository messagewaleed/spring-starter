package com.socgen.waleed.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("anEngineer") //No bean declarations now in the xml!!!
public class AnnotationsEngineer {
	
	@Autowired // 3
	private Laptop laptop;
	
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
	}
	
	
}
