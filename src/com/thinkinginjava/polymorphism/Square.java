package com.thinkinginjava.polymorphism;

import com.thinkinginjava.tools.*;
public class Square extends Shape{

	@Override
	public void draw() { Tools.Println("Square.draw()"); }
	
	@Override
	public void erase() { Tools.Println("Square.erase()"); }
	
	@Override
	public void func_type3() {
		System.out.println("Square.func_type3()");
	}
}
