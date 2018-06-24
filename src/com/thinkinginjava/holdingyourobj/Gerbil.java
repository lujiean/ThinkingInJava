package com.thinkinginjava.holdingyourobj;

/*
 * Exercise 1: (2) Create a new class called Gerbil with an int gerbilNumber that¡¯s initialized in the constructor. 
 * Give it a method called hop( ) that displays which gerbil number this is, and that it¡¯s hopping. 
 * Create an ArrayList and add Gerbil objects to the List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
 */
public class Gerbil {
	private int gerbilNumber;
	Gerbil(int i){
		gerbilNumber = i;
	}
	
	public void hop() {
		System.out.println("gerbilNumber: " + gerbilNumber);
	}
}
