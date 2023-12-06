package com.ryan.zookeeper;

public class Mammal {

	protected int energy = 100;
	protected String name;
	
	public Mammal(int energy) {
		this.energy = energy;
	}
	
	public Mammal() {
		this.energy = 100;
	}
	
	public void displayEnergy() {
		System.out.println("Energy remaining: " + this.energy);
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

}
