package com.socgen.waleed.training;

public class Department {
	
	private String name;
	
	private String domain;
	
	public Department() {
		
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", domain=" + domain + "]";
	}

	public Department(String name, String domain) {
		super();
		this.name = name;
		this.domain = domain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
