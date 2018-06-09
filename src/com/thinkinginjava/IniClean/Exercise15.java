package com.thinkinginjava.IniClean;

/*
 * Exercise 15: (1) Create a class with a String that is initialized using instance initialization.
 */
public class Exercise15 {

	public String str;
	{
		str = "fist ini";
	}
	
	public Exercise15() {
		// TODO Auto-generated constructor stub
		System.out.println(str);
		System.out.println("Exercise15 created");
	}
}
