package com.thinkinginjava.IniClean;

/*
 * Exercise 3: (1) Create a class with a default constructor (one that takes no arguments) that prints a message. Create an object of this class.
 * Exercise 4: (1) Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.
 */
public class Exercise3 {

	public Exercise3() {
		// TODO Auto-generated constructor stub
		System.out.println("Create an object of this class.");
	}
	
	public Exercise3(String str) {
		System.out.println("this is my str Class: " + str);
	}
}
