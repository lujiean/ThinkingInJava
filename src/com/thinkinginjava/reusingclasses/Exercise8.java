package com.thinkinginjava.reusingclasses;

/*
 * Exercise 8: (1) Create a base class with only a non-default constructor, and a derived class with both a default (no-arg) and non-default constructor. 
 * In the derived-class constructors, call the base-class constructor.
 */
import com.thinkinginjava.tools.*;
class Exercise8Base{
	Exercise8Base(int i){
		Tools.Println("Exercise8Base construct with arg: " + i);
	}
}
public class Exercise8 extends Exercise8Base{

	public Exercise8() {
		super(999);
		Tools.Println("Exercise8 construct");
	}
	public Exercise8(int i) {
		super(i);
		Tools.Println("Exercise8 construct with agr: " + i);
	}
}

