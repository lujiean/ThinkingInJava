package com.thinkinginjava.innerclasses;

/*
 * Exercise 23: (4) Create an interface U with three methods. 
 * Create a class A with a method that produces a reference to a U by building an anonymous inner class. 
 * Create a second class B that contains an array of U. 
 * B should have one method that accepts and stores a reference to a U in the array, 
 * a second method that sets a reference in the array (specified by the method argument) to null, 
 * and a third method that moves through the array and calls the methods in U. 
 * In main( ), create a group of A objects and a single B. 
 * Fill the B with U references produced by the A objects. 
 * Use the B to call back into all the A objects. 
 * Remove some of the U references from the B.
 */

import static com.thinkinginjava.tools.Tools.*;

interface U{
	public void funcZ();
	public void funcY();
	public void funcX();
}

class A{
	public void funcA() {
		Println("A.funcA()");
	}
	
	public U makeU() {
		return new U() {

			@Override
			public void funcZ() {
				// TODO Auto-generated method stub
				Println("A.makeU.funcZ()");
			}

			@Override
			public void funcY() {
				// TODO Auto-generated method stub
				Println("A.makeU.funcY()");
			}

			@Override
			public void funcX() {
				// TODO Auto-generated method stub
				Println("A.makeU.funcX()");
			}	
			
		};
	}
}

class B{
	private int cur_length = 2;
	public U[] uArray = new U[cur_length];
	
	public void funcB(U i_uArray, int i) {
		this.uArray[i] = i_uArray;
	}
	
	public void funcC(int i) {
		if (i < cur_length && i >=0) {
			uArray[i] = null;
			while(i + 1 < cur_length)
			{
				uArray[i] = uArray[i+1];
				i++;
			}
			cur_length--;
		}
	}
	
	public void funcD() {
		for(int i=0; i < cur_length; i++) {
			uArray[i].funcZ();
			uArray[i].funcY();
			uArray[i].funcX();
		}
	}
}

public class Ex23 {

	public static void main(String[] args) {
		A[] aArray = new A[2];
		for(int i = 0; i< aArray.length; i++)
			aArray[i] = new A();
		B b = new B();
		
		for (int i = 0; i< aArray.length; i++)
			b.funcB(aArray[i].makeU(), i);
		b.funcD();
		
		Println("------");
		b.funcC(0);
		b.funcD();
	}
}
