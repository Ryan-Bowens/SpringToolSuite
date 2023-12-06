package com.ryan.zookeeper;

public class Test {

	public static void main(String[] args) {
		
		Gorilla fred = new Gorilla();
		
		fred.throwSomething();
		fred.throwSomething();
		fred.throwSomething();
		
		fred.eatBananas();
		fred.eatBananas();
		
		fred.climb();
	
		fred.displayEnergy();
		
		
		Bat flower = new Bat(300);
		
		flower.attackTown();
		flower.attackTown();
		flower.attackTown();
		
		flower.eatHumans();
		flower.eatHumans();
		
		flower.fly();
		flower.fly();
		
		flower.displayEnergy();
	}

}
