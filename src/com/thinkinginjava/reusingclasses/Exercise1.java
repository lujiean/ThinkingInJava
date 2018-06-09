package com.thinkinginjava.reusingclasses;

/*
 * Exercise 1: (2) Create a simple class. Inside a second class, define a reference to an object of the first class. 
 * Use lazy initialization to instantiate this object.
 */
import com.thinkinginjava.tools.*;
public class Exercise1 {
	private String str;
	private Exercise1p1 ex1p1;
	Exercise1(){
	}
	public String toString() {
		//lazy construction
		if(str == null) {
			str = "what a pitty";
		}
		//lazy construction
		if(ex1p1 == null) {
			ex1p1 = new Exercise1p1();
		}
		return "In Exercise1 : ex1p1 = " + ex1p1 + "\n" + str;
	}
}

class Exercise1p1{
	private String s;
	Exercise1p1() {
		// TODO Auto-generated constructor stub
		Tools.Println("Exercise1p1 Constructed");
		s = "hello";
	}
	public String toString() {
		return s;
	}
}