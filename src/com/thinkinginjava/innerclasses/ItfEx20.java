package com.thinkinginjava.innerclasses;

/*
 * Exercise 20: (1) Create an interface containing a nested class. 
 * Implement this interface and create an instance of the nested class.
 */
public interface ItfEx20 {

	void func1();
	public static class ItfEx20_in implements ItfEx20{
		public void func1() {
			System.out.println("test ItfEx20.func1()");
		}
		public static void main(String[] args) {
			ItfEx20_in ex20 = new ItfEx20.ItfEx20_in();
			ex20.func1();
		}
	}
}
