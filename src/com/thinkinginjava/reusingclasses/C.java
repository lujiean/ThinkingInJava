package com.thinkinginjava.reusingclasses;

/*
 * Exercise 5: (1) Create two classes, A and B, with default constructors (empty argument lists) that announce themselves. 
 * Inherit a new class called C from A, and create a member of class B inside C. 
 * Do not create a constructor for C. 
 * Create an object of class C and observe the results.
 * 
 * Exercise 7: (1) Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors. 
 * Write a constructor for C and perform all initialization within C¡¯s constructor.
 */
import com.thinkinginjava.tools.*;
class A {
	A() {
		Tools.Println("Class A construct");
	}
	
	A(int i){
		Tools.Println("Class A construct with args " + i);
	}
}

class B {
	B(){
		Tools.Println("Class B construct");
	}
	B(int i){
		Tools.Println("Class B construct with args " + i);
	}
}
public class C extends A{
	B b = new B();
	B b1 = new B(10);
	C (){
		
	}
	C (int i){
		super(i);
		Tools.Println("Class C construct with args " + i);
	}
}
