package com.thinkinginjava.innerclasses;

/*
 * Exercise 15: (2) Create a class with a non-default constructor (one with arguments) and no default constructor (no "no-arg" constructor). 
 * Create a second class that has a method that returns a reference to an object of the first class. 
 * Create the object that you return by making an anonymous inner class that inherits from the first class.
 */
class Ex15Base {
	Ex15Base(int i){
		System.out.println("Ex15Base Construct: " + i);
	}
}
public class Ex15 {

	public Ex15Base func1(int i) {
		return new Ex15Base(i) {
			{System.out.println("Ex15.func1() + " + i);}
		};
	}
	
	//-------------
	class Ex15_in extends Ex15Base{

		Ex15_in(int i) {
			super(i);
			// TODO Auto-generated constructor stub
			System.out.println("Ex15_in.Construct");
		}
	}
	public Ex15Base func2(int i) {return new Ex15_in(i);}
}
