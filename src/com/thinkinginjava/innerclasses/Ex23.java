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
	public U[] uArray;
	
	public void funcB(U[] i_uArray) {
		this.uArray = i_uArray;
	}
	
	public void funcC(int i) {
		uArray[i] = null;
	}
	
	public void funcD() {
		for(int i=0; i < uArray.length; i++) {
			uArray[i].funcZ();
			uArray[i].funcY();
			uArray[i].funcX();
		}
	}
}

public class Ex23 {

	public static void main(String[] args) {
		A[] aArray = new A[10];
		B b = new B();
		
		b.funcB(aArray);
	}
}
