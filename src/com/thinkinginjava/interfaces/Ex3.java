package com.thinkinginjava.interfaces;

abstract class AbsBaseEx3{
	
	abstract void print();
	public AbsBaseEx3() {
		// TODO Auto-generated constructor stub
		print();
	}
}
public class Ex3 extends AbsBaseEx3{

	private int i = 66;
	void print() {
		System.out.println("Ex3.print() - " + i);
	}
	
}
