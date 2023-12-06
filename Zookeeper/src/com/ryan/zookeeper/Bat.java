package com.ryan.zookeeper;

public class Bat extends Mammal{

	
	public Bat(int energy) {
		super(energy);
//		energy needs to be at 300
	}
	
	public void fly() {
		this.energy -= 50;
		System.out.println("The bat is airborn! Energy Remaining: " + energy);
	}
	
	public void eatHumans() {
		this.energy += 25;
		System.out.println("The bat is satisfied. Energy Reamaining: " + energy);
	}
	
	public void attackTown() {
		this.energy -= 100;
		System.out.println("The bat attacks! Energy Remaining: " + energy);
	}

}
