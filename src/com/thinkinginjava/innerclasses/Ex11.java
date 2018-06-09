package com.thinkinginjava.innerclasses;

/*
 * Exercise 11: (2) Create a private inner class that implements a public interface. 
 * Write a method that returns a reference to an instance of the private inner class, upcast to the interface. 
 * Show that the inner class is completely hidden by trying to downcast to it.
 */
public class Ex11 {

	private class Ex11_in implements ItfEx9{

		@Override
		public void func1() {
			// TODO Auto-generated method stub
			System.out.println("Ex11_in.func1()");
		}
	}
	
	public ItfEx9 func2() {
		Ex11 ex11 = new Ex11();
		Ex11_in ex11_in = ex11.new Ex11_in();
		return ex11_in;
	}
}
