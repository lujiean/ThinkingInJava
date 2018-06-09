package com.thinkinginjava.IniClean;

/*
 * Exercise 12: (4) Create a class called Tank that can be filled and emptied, 
 * and has a termination condition that it must be empty when the object is cleaned up. 
 * Write a finalize( ) that verifies this termination condition. In main( ), 
 * test the possible scenarios that can occur when your Tank is used.
 */
public class Tank {

	public boolean is_filled = false;
	
	public void Fullfill() {
		is_filled = true;
	}
	
	public void Pickout() {
		is_filled = false;
	}
	
	protected void finalize() {
		if (is_filled)
			System.out.println("current Tank is filled!");
	}
}
