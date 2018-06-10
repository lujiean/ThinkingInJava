package com.thinkinginjava.innerclasses;

/*
 * Exercise 21: (2) Create an interface that contains a nested class that has a static method that calls the methods of your interface and displays the results. 
 * Implement your interface and pass an instance of your implementation to the method.
 */
public interface ItfEx21 {

	public void func1(ItfEx21 itfex21);
	public int i = 99;
	
	public static class ItfEx21_in implements ItfEx21{

		@Override
		public void func1(ItfEx21 itfex21) {
			// TODO Auto-generated method stub
			System.out.println("ItfEx21_in.func1() + " + ItfEx21.i);
		}
		
		public static void main(String[] args) {
			ItfEx21 it21 = new ItfEx21_in();
			new ItfEx21_in().func1(it21);
		}
	}
}
