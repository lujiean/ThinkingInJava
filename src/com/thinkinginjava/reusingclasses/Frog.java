package com.thinkinginjava.reusingclasses;

/*
 * Exercise 16: (2) Create a class called Amphibian. From this, inherit a class called Frog. 
 * Put appropriate methods in the base class. 
 * In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
 */

import com.thinkinginjava.tools.*;
class Amphibian{
	String name;
	Amphibian(String name){
		this.name = name;
	}
	
	void climb(Amphibian amp) {
		Tools.Println(amp + " is climbing.");
	}
	
	public String toString() {
		return name;
	}
}
public class Frog extends Amphibian{

	Frog(){
		super("Frog");
	}
	
	void climb(Amphibian frog) {
		Tools.Println(frog + "my frong is climb");
	}
}
