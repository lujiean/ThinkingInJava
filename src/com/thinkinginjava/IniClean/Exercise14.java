package com.thinkinginjava.IniClean;

/*
 * Exercise 14: (1) Create a class with a static String field that is initialized at the point of definition, 
 * and another one that is initialized by the static block. 
 * Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
 */
public class Exercise14 {

	public static String stastr1 ="firstststr";
	public static String stastr2;
	static {
		stastr2 = "secondststr";
	}
	public static void PrintStatic() {
		System.out.println(stastr1);
		System.out.println(stastr2);
	}
}
