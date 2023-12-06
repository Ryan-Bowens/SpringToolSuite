package com.ryan.interfacedemo;

public class Cat extends Pet implements Keepable{
//	implement is for interface

	public Cat() {}
	
	public Cat(String name) {
		super(name, "cat");
	}

	@Override
	public void showAffection() {
		System.out.println("Scratch, sleeps");
		
	}

	@Override
	public void askForFood() {
		System.out.println("Meow, Rubs, Purr, Hiss");
		
	}

}
