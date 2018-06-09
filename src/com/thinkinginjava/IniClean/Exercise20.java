package com.thinkinginjava.IniClean;

/*
 * Exercise 20: (1) Create a main( ) that uses varargs instead of the ordinary main( ) syntax. Print all the elements in the resulting args array. 
 * Test it with various numbers of command-line arguments.
 */
public class Exercise20 {

	public static void main(String ... args) {
		for(String arg : args) {
			System.out.print(arg + " ");
		}
		System.out.println();
	}
}
