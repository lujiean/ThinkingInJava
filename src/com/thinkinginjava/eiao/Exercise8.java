package com.thinkinginjava.eiao;

/*
 * Exercise 8: (3) Write a program that demonstrates that, no matter how many objects you create of a particular class, 
 * there is only one instance of a particular static field in that class.
 */
public class Exercise8 {

	static int i = 40;
	
	void increment() {
		i++;
	}
}
