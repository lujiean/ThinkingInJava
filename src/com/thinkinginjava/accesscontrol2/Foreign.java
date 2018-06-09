package com.thinkinginjava.accesscontrol2;

/*
 * Exercise 9: (2) Create the following file in the access/local directory (presumably in your CLASSPATH):
 * 
 * Then create the following file in a directory other than access/local:
 * 
 * Explain why the compiler generates an error. 
 * ( PackagedClase is package access, can not access in other package)
 * 
 * Would making the Foreign class part of the access.local package change anything?
 * ( can use public in Packaged class can access)
 */
import com.thinkinginjava.accesscontrol.*;	

public class Foreign {
	public static void main(String[] args) {
		//PackagedClase is package access, can not access in other package
//		PackagedClass pc = new PackagedClass();
	}
}
