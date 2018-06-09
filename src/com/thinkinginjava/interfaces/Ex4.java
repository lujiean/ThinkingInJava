package com.thinkinginjava.interfaces;

abstract class AbsBaseEx4{
	public abstract void func1();
}

public class Ex4 extends AbsBaseEx4{

	public void func1(){
		System.out.println("Ex4.func1()");
	}
	
	public static void stcFunc2() {
		System.out.println("Ex4.stcFunc2()");
		AbsBaseEx4 abe4 = new Ex4();
//		((Ex4)abe4).func1();
		abe4.func1();
	}
}
