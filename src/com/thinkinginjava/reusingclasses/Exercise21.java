package com.thinkinginjava.reusingclasses;

/*
 * Exercise 21: (1) Create a class with a final method. Inherit from that class and attempt to overwrite that method.
 */
import com.thinkinginjava.tools.*;

class Exercise21Base{
//	public final void print() {
		public void print() {
		Tools.Println("print final function");
	}
}
public class Exercise21 extends Exercise21Base{

	// cannot override final
	// like the private function
	public void print() {
		Tools.Println("print override final");
	}
}
