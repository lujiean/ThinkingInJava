package com.thinkinginjava.polymorphism;

class Exercise10Base{
	public void func1() {
		System.out.println("Exercise10Base.func1");
		func2();
	}
	
	public void func2() {
		System.out.println("Exercise10Base.func2");
	}
}
public class Exercise10 extends Exercise10Base{

	public void func2() {
		System.out.println("Exercise10.func2");
	}
}
