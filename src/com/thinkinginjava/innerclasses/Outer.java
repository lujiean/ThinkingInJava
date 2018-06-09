package com.thinkinginjava.innerclasses;

/*
 * Exercise 1: (1) Write a class named Outer that contains an inner class named Inner. 
 * Add a method to Outer that returns an object of type Inner. 
 * In main( ), create and initialize a reference to an Inner.
 */

/*
 * Exercise 3: (1) Modify Exercise 1 so that Outer has a private String field (initialized by the constructor), 
 * and Inner has a toString( ) that displays this field. 
 * Create an object of type Inner and display it.
 */

import static com.thinkinginjava.tools.Tools.*;
public class Outer {

	private String str;
	
	Outer(){}
	Outer(String s){
		str = s;
	}
	
	class Inner{
		public String toString() {
			return str;
		}
	}
	
	public Inner getInner() {
		return new Inner();
	}
}
