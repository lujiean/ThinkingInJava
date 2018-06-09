package com.thinkinginjava.innerclasses;

/*
 * Exercise 19: (2) Create a class containing an inner class that itself contains an inner class. 
 * Repeat this using nested classes. 
 * Note the names of the .class files produced by the compiler.
 */
public class Ex19 {

	public static class Ex19_in{
		public static class Ex19_in_in{
			public static void func1() {
				System.out.println("Ex19.Ex19_in.Ex19_in_in.func1()");
			}
		}
	}
}
