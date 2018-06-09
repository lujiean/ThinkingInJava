package com.thinkinginjava.reusingclasses;

/*
 * Exercise 24: (2) In Beetle.java, inherit a specific type of beetle from class Beetle, following the same format as the existing classes. 
 * Trace and explain the output.
 */
public class Exercise24 extends Beetle{
	private int k = printInit("Exercise24.k initialized");
	public Exercise24() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x3 =
			printInit("static Exercise24.x3 initialized");
}
