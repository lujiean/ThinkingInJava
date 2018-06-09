package com.thinkinginjava.innerclasses;

/*
 * Exercise 18: (1) Create a class containing a nested class. In main( ), create an instance of the nested class.
 */
public class Ex18 {

	public static class Ex18_in{
		public static int i = 90;
	}
	
	public static void main(String[] args) {
		Ex18_in ex18_in = new Ex18_in();
		System.out.println(ex18_in.i);
		
		System.out.println(Ex18_in.i);
	}
}
