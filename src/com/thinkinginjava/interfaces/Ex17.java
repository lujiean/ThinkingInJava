package com.thinkinginjava.interfaces;

import java.util.Random;

/*
 * Exercise 17: (2) Prove that the fields in an interface are implicitly static and final.
 */
interface ItfEx17 {
	int INT_1 = 9;
	String str = "abc";
	int INT_dyn = (new Random()).nextInt();
}

public class Ex17 implements ItfEx17{
	
}