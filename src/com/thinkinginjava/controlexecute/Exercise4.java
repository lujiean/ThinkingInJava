package com.thinkinginjava.controlexecute;

/*
 * Exercise 4: (3) Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime numbers 
 * (integral numbers that are not evenly divisible by any other numbers except for themselves and 1).
 */
public class Exercise4 {

	public static boolean DetectNestedNumber(int num) {
		for(int i=2;i<=num-1;i++)
		{
			// can be devided by other number
			if(num % i == 0)
				return false;
		}
		return true;
	}
}
