package com.thinkinginjava.IniClean;

/*
 * Exercise 9: (1) Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
 */
public class Exercise9 {

	public int i;
	public String s;
	Exercise9() {
		this(9);
		System.out.println("call Exercise9()");
	}
	
	Exercise9(int i) {
		this("my");
		this.i = i;
		System.out.println("call Exercise9(int i)");
	}
	
	Exercise9(String s){
		this.s = s;
		System.out.println("call Exercise9(String s)");
	}
}
