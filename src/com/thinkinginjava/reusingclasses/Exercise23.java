package com.thinkinginjava.reusingclasses;

/*
 * Exercise 23: (2) Prove that class loading takes place only once. 
 * Prove that loading may be caused by either the creation of the first instance of that class or by the access of a static member.
 */
import static com.thinkinginjava.tools.Tools.*;
public class Exercise23 {

	private static int i = AssingInt();
			
	private static int AssingInt() {
		Println("Class static initialize");
		return 45;
	}
	
	public static void PrintStaticI() {
		Println("Static I = " + i);
	}
}
