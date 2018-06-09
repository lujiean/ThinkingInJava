package com.thinkinginjava.polymorphism;

import static com.thinkinginjava.tools.Tools.*;
public class Triangle extends Shape{

	@Override
	public void draw() { Println("Triangle.draw()"); }
	
	@Override
	public void erase() { Println("Triangle.erase()"); }
	
	@Override
	public void func_type3() {
		System.out.println("Triangle.func_type3()");
	}
}
