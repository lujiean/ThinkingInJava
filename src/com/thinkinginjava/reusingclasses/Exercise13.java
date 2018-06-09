package com.thinkinginjava.reusingclasses;

/*
 * Exercise 13: (2) Create a class with a method that is overloaded three times. 
 * Inherit a new class, add a new overloading of the method, and show that all four methods are available in the derived class.
 */
import com.thinkinginjava.tools.*;

class Exercise13Base {

	void PrintOVL(int i) {
		Tools.Println("OVL int : " + i);
	}
	
	void PrintOVL(char ch) {
		Tools.Println("OVL char : " + ch);
	}
	
	void PrintOVL(float f) {
		Tools.Println("OVL float : " + f);
	}
}

public class Exercise13 extends Exercise13Base{

	void PrintOVL(String str) {
		Tools.Println("OVL String : " + str);
	}
}
