package com.thinkinginjava.interfaces;

import com.thinkinginjava.interfaces2.*;

public class Ex6 implements ItfEx6{

	@Override
	//Cannot reduce the visibility of the inherited method from ItfEx6
	// only can use public 
//	void func1() {
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("Ex6.func1()");
	}
}
