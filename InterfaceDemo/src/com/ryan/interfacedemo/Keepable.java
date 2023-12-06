package com.ryan.interfacedemo;

public interface Keepable {

//	default : usable
	public default void play() {
		System.out.println("playing...");
	}
	
//	abstract : has to be completed when interface is implemented
	abstract void showAffection();
	abstract void askForFood();
}
