package com.thinkinginjava.IniClean;

/*
 * Exercise 10: (2) Create a class with a finalize( ) method that prints a message. 
 * In main( ), create an object of your class. Explain the behavior of your program.
 * 
 * Exercise 11: (4) Modify the previous exercise so that your finalize( ) will always be called.
 */
public class Exercise10 {

	public int order;
	protected void finalize() {
		System.out.println("call finalize var: " + order);
//		super.finalize();
	}
	
	Exercise10(int i){
		order = i;
	}
}
