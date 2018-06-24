package com.thinkinginjava.innerclasses;

/*
 * Exercise 26: (2) Create a class with an inner class that has a non-default constructor (one that takes arguments). 
 * Create a second class with an inner class that inherits from the first inner class.
 */
class C1{
//	C1(int i){
//		System.out.println("Construct C1: " + i);
//	}
	class C1in{
		C1in(int i){
			System.out.println("Construct C1in: " + i);
		}
	}
}
public class Ex26 {
//double extends
//public class Ex26 extends C1{

	class Ex26in extends C1.C1in{
		Ex26in(C1 c1, int i){
			c1.super(i);
		}
	}
	
}
