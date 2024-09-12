package com.socgen.waleed.training;

public class ComputerEnginner {

	private Laptop laptop;

	public ComputerEnginner() {
		
	}
	
	void work() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "ComputerEngineer [laptop=" + laptop + "]";
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public ComputerEnginner(Laptop laptop) {
		super();
		this.laptop = laptop;
	}
}
