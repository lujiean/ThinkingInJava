package com.thinkinginjava.eiao;

/*
 * Exercise 12: (2) Find the code for the second version of HelloDate.java, which is the simple comment documentation example. 
 * Execute Javadoc on the file and view the results with your Web browser.
 * 
 * Exercise 14: (1) Add an HTML list of items to the documentation in the previous exercise.
 */

//: object /HelloDate.java
import java.util.*;

/** 
 * The first Thinking in Java example program
 * Displays a string and today's date.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 *
 */
public class HelloDate {

	/** 
	 * Entry point to class and application
	 * @param args array of string arguments
	 * \@throws exceptions No exceptions thrown
	 */
	public static void main(String[] args) {
		System.out.println("Hello, it's: ");
		System.out.println(new Date());
	}
} /* Output: (55% match)
Hello, it's:
Web Oct 05 14:39:36 MDT 2005
*///:~

