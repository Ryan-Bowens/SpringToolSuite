package com.ryan.devoop3;

public class BackEndDev extends Developer {
	public boolean isLogical;

	public BackEndDev(){
		super("Anonymous" /*, 25 <- age, 100000 <- salary */);
		this.setSalary(100000);
		this.isLogical = true;
	}
	
	public void displayStatus() {
		super.displayStatus();
//		super is taking it from Developer.java
		System.out.println("isLogical: " + this.isLogical);
	}
	
	public void giveRaise(double amount) {
		double totalSalary = this.getSalary() + amount;
		this.setSalary(totalSalary);
	}
}
