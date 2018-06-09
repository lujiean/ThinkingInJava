package com.thinkinginjava.IniClean;

/*
 * Exercise 8: (1) Create a class with two methods. Within the first method, call the second method twice: the first time without using this, 
 * and the second time using this¡ªjust to see it working; you should not use this form in practice.
 */
public class Exercise8 {

	public void method1() {
		System.out.println("call method1");
		method2();
	}
	
	public void method1p1() {
		System.out.println("call method1p1");
		this.method2();
	}
	
	public void method2() {
		System.out.println("call method2");
	}
}
