package com.thinkinginjava.polymorphism;

import com.thinkinginjava.tools.*;
public class Circle extends Shape{
	
	@Override
	public void draw() { Tools.Println("Circle.draw()"); }
	
	@Override
	public void erase() { Tools.Println("Circle.erase()"); }
	
	@Override
	public void func_type2() {
		Tools.Println("Circle.func_type2()");
	}
	
	@Override
	public void func_type3() {
		System.out.println("Circle.func_type3()");
	}
}
