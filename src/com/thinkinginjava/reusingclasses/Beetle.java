package com.thinkinginjava.reusingclasses;

/*
 * Exercise 24: (2) In Beetle.java, inherit a specific type of beetle from class Beetle, following the same format as the existing classes. 
 * Trace and explain the output.
 */

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		System.out.println("i = " + i + ", j = " + j);
			j = 39;
	}
	private static int x1 =
			printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 =
			printInit("static Beetle.x2 initialized");
//	public static void main(String[] args) {
//		System.out.println("Beetle constructor");
//		Beetle b = new Beetle();
//	}
}
