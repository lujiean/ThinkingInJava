package com.thinkinginjava.accesscontrol;

/*
 * Exercise 6: (1) Create a class with protected data. 
 * Create a second class in the same file with a method that manipulates the protected data in the first class.
 */
public class Exercise6 {

	public void maniProtect() {
		Exrcise6ext ex6ext = new Exrcise6ext();
		System.out.println("before assign: " + ex6ext.iProtected);
		ex6ext.iProtected = 90;
		System.out.println("after assign: " + ex6ext.iProtected);
	}
}

class Exrcise6ext{
	
	protected int iProtected = 10;
}