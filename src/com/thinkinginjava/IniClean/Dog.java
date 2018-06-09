package com.thinkinginjava.IniClean;

/*
 * Exercise 5: (2) Create a class called Dog with an overloaded bark( ) method. 
 * This method should be overloaded based on various primitive data types, and print different types of barking, howling, etc., 
 * depending on which overloaded version is called. Write a main( ) that calls all the different versions.
 * 
 * Exercise 6: (1) Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types), 
 * but in reversed order relative to each other. Verify that this works.
 */
public class Dog {

	public void bark(String str) {
		System.out.println("bark a str:" + str);
	}
	
	public void bark(int i) {
		System.out.println("bark times: " + i);
	}
	
	public void bark(char ch) {
		System.out.println("bark chars: " + ch);
	}
	
	public void bark(int i, char j) {
		System.out.println("bark ij times: " + i + "," + j);
	}
	
	public void bark(char j, int i) {
		System.out.println("bark ji str: " + j + "," + i);
	}
}
