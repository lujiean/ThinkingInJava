package com.thinkinginjava.innerclasses;

/*
 * Exercise 8: (2) Determine whether an outer class has access to the private elements of its inner class.
 */
public class Ex8 {

	class Ex8_In {
		private int i = 118;
	}
	
	public static void func1(){
		Ex8 ex8 = new Ex8();
		Ex8_In ex8_in = ex8.new Ex8_In();
		
//		can not direct access
		System.out.println("Ex8.func1() - " + ex8_in.i);
	}
	
}
