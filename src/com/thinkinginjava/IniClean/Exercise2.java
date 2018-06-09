package com.thinkinginjava.IniClean;

/*
 * Exercise 2: (2) Create a class with a String field that is initialized at the point of definition, and another one that is initialized by the constructor. 
 * What is the difference between the two approaches?
 */
public class Exercise2 {

	public String str1 = "abc";
	public String str2;
	public Exercise2() {
		// TODO Auto-generated constructor stub
		str2 = "Abc";
	}	
}
