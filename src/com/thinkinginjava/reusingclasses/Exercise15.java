package com.thinkinginjava.reusingclasses;

/*
 * Exercise 15: (2) Create a class inside a package. 
 * Your class should contain a protected method. 
 * Outside of the package, try to call the protected method and explain the results. 
 * Now inherit from your class and call the protected method from inside a method of your derived class.
 */
import static com.thinkinginjava.tools.Tools.*;
public class Exercise15 {

	protected void PrintProtect() {
		Println("call PrintProtect");
	}
}
