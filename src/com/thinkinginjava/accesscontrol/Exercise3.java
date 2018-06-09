package com.thinkinginjava.accesscontrol;

/*
 * Exercise 3: (2) Create two packages: debug and debugoff, containing an identical class with a debug( ) method. 
 * The first version displays its String argument to the console, the second does nothing. 
 * Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect.
 */

// import debug mode
//import static debug.Debug.*;

//import prod mode
import static debugoff.Debug.*;

public class Exercise3 {

	public static void main(String[] args) {
		debug();
	}
}
