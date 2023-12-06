package com.ryan.zookeeper;

public class Gorilla extends Mammal{

	public Gorilla() {

	}

	public void throwSomething() {
		this.energy -= 5;
		System.out.println("The gorilla throws something! Remaining Energy: " + energy);
	}
	
	public void eatBananas() {
		this.energy += 10;
		System.out.println("The gorilla is pleased. Remaining Energy: " + energy);
	}
	
	public void climb() {
		this.energy -= 10;
		System.out.println("The gorilla climbed a tree. Remaining Energy: " + energy);
	}
	
}
