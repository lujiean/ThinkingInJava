package com.thinkinginjava.reusingclasses;

/*
 * Exercise 9: (2) Create a class called Root that contains an instance of each of the classes (that you also create) named Component1, Component2, and Component3. 
 * Derive a class Stem from Root that also contains an instance of each ¡°component.¡± 
 * All classes should have default constructors that print a message about that class.
 * 
 * Exercise 10: (1) Modify the previous exercise so that each class only has non-default constructors.
 * 
 * Exercise 12: (3) Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.
 */
import static com.thinkinginjava.tools.Tools.*;
class Root{
	Component1 cp1 = new Component1(1);
	Component2 cp2 = new Component2(2);
	Component3 cp3 = new Component3(3);
	
	Root(int i){
		Println("Root construct with args : " + i);
	}
	
	public void dispose(int i){
		Println("Root dispose :" + i);
	}
}

class Component1{
//	Component1() {
	Component1(int i) {
		// TODO Auto-generated constructor stub
//		Println("Component1 construct");
		Println("Component1 construct with args : " + i);
	}
	
	public void dispose(int i){
		Println("Component1 dispose :" + i);
	}
}

class Component2{
	Component2(int i) {
		// TODO Auto-generated constructor stub
		Println("Component2 construct with args : " + i);
	}
	
	public void dispose(int i){
		Println("Component2 dispose :" + i);
	}
}

class Component3{
	Component3(int i) {
		// TODO Auto-generated constructor stub
		Println("Component3 construct with args : " + i);
	}
	
	public void dispose(int i){
		Println("Component3 dispose :" + i);
	}
}

public class Stem extends Root{

	Component1 cp1 = new Component1(11);
	Component2 cp2 = new Component2(22);
	Component3 cp3 = new Component3(33);
	
	public Stem(int i) {
		super(i);
		Println("Stem construct with args : " + i);
	}
	
	public void dispose(int i){
		cp1.dispose(i);
		cp2.dispose(i);
		cp3.dispose(i);
		super.dispose(i);
		Println("Stem dispose :" + i);
	}
}
