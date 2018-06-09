package com.thinkinginjava.innerclasses;

/*
 * Exercise 2: (1) Create a class that holds a String, and has a toString( ) method that displays this String. 
 * Add several instances of your new class to a Sequence object, then display them.
 */

public class Ex2 {

	private String str;
	
	Ex2(String s){
		str = s;
		
	}
	public String toString() {
		return str;
	}
}
