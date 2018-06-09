package com.thinkinginjava.reusingclasses;

import java.util.Random;

/*
 * Exercise 18: (2) Create a class with a static final field and a final field and demonstrate the difference between the two.
 */
public class Exercise18 {

	public static Random rand = new Random(47);
	public static final int SF = rand.nextInt(100);
//	public static final int SF = 100;
	public final int f = rand.nextInt(100);
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("SF: " + SF + " f:" + f);
	}
}
