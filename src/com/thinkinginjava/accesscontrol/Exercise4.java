package com.thinkinginjava.accesscontrol;

/*
 * Exercise 4: (2) Show that protected methods have package access but are not public.
 */
public class Exercise4 {

	protected static void printEx4Protected() {
		System.out.println("this is a protect function");
	}
	public static void printEx4Public() {
		System.out.println("this is a public function");
	}
	
	static void printEx4Default() {
		System.out.println("this is a default function");
	}
}
