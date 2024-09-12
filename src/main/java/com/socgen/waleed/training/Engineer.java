package com.socgen.waleed.training;

import java.util.List;

public class Engineer {

	private Integer id;

	private String name;
	
	private String skills;
	
	private Department department;
	
//	private List<Department> departments;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

//	public List<Department> getDepartments() {
//		return departments;
//	}
//
//	public void setDepartments(List<Department> departments) {
//		this.departments = departments;
//	}

	public Engineer() {

	}

	public Engineer(Integer id, String name, String skills, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		System.out.println("Setter for id called");
		this.id = id;
	}

	

	@Override
	public String toString() {
		return "Engineer [id=" + id + ", name=" + name + ", skills=" + skills + ", department=" + department + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter for name called");
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		System.out.println("Setter for skills called");
		this.skills = skills;
	}


	public void workForWages() {
		System.out.println("Hello I am an engineer and my details are : ");
		System.out.println(this);
		System.out.println("And I work for the department : " + getDepartment());
	}

}
