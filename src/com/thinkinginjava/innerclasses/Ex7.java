package com.thinkinginjava.innerclasses;

/*
 * Exercise 7: (2) Create a class with a private field and a private method. 
 * Create an inner class with a method that modifies the outer-class field and calls the outer-class method. 
 * In a second outer-class method, create an object of the inner class and call its method, then show the effect on the outer-class object.
 */

public class Ex7 {

	private int i = 4;
	
	private void func1() {
		System.out.println("Ex7.func1() - " + i);
	}
	
	class Ex7_In {
		public void func2() {
			i = 8;
			func1();
		}
	}
	
	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
		ex7.func1();
		
		Ex7_In ex7in = ex7.new Ex7_In();
		ex7in.func2();
	}
}
