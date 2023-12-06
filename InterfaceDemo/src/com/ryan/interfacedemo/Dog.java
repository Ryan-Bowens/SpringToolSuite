package com.ryan.interfacedemo;

public class Dog extends Pet implements Keepable{

	public Dog() {}
	
	public Dog(String name) {
		super(name, "dog");
	}

	@Override
	public void showAffection() {
		System.out.println("Wag tail");
		
	}

	@Override
	public void askForFood() {
		System.out.println("Barks, Stares at food");
		
	}

}
