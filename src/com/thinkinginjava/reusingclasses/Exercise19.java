package com.thinkinginjava.reusingclasses;

/*
 * Exercise 19: (2) Create a class with a blank final reference to an object. 
 * Perform the initialization of the blank final inside all constructors. 
 * Demonstrate the guarantee that the final must be initialized before use, and that it cannot be changed once initialized.
 */

class compo1{
	public int i;
	compo1(int i){
		this.i = i;
	}
}
public class Exercise19 {
	public final compo1 cmp;
	
	Exercise19(int i){
		cmp = new compo1(i);
	}
}
