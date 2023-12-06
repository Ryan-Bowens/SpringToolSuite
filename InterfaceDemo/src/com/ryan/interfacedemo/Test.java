package com.ryan.interfacedemo;

public class Test {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Trouble");
		Cat cat2 = new Cat("Milly");
		
		cat1.showAffection();
		
		cat2.askForFood();
		
		cat1.play();
		
		Dog dog1 = new Dog("Bear");
		Dog dog2 = new Dog("Scooby");
		
		dog1.showAffection();
		
		dog2.askForFood();
		
		dog1.play();

	}

}
