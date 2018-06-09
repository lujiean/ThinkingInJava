package com.thinkinginjava.IniClean;

/*
 * Exercise 19: (2) Write a method that takes a vararg String array. 
 * Verify that you can pass either a comma-separated list of Strings or a String[] into this method.
 */
public class Exercise19 {

	public static void PrintVarArg(String ... args) {
		for(String str : args) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
}
