package com.thinkinginjava.interfaces;

/*
 * Exercise 14: (2) Create three interfaces, each with two methods. 
 * Inherit a new interface that combines the three, adding a new method. 
 * Create a class by implementing the new interface and also inheriting from a concrete class. 
 * Now write four methods, each of which takes one of the four interfaces as an argument. 
 * In main( ), create an object of your class and pass it to each of the methods.
 */

interface ItfA {
//	void funcItfA1();
//	void funcItfA2();
	void func1();
	void func2();
}

interface ItfB {
//	void funcItfB1();
//	void funcItfB2();
	void func1();
	void func2();
}

interface ItfC{
//	void funcItfC1();
//	void funcItfC2();
	void func1();
	void func2();
}

interface ItfABC extends ItfA, ItfB, ItfC{
//	void funcItfABC1();
	void func3();
}

class Ex14Base {
	
}

abstract class Ex14BaseAbs{
	
}
//public class Ex14 extends Ex14Base implements ItfABC{
public class Ex14 extends Ex14BaseAbs implements ItfABC{
	static void processA(ItfA a) {}
	static void processB(ItfB b) {}
	static void processC(ItfC c) {}
	static void processABC(ItfABC abc) {}
	@Override
	public void func1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void func2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void func3() {
		// TODO Auto-generated method stub
		
	}
}
