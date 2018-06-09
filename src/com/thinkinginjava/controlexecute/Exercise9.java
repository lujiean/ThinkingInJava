package com.thinkinginjava.controlexecute;

/*
 * Exercise 9: (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, 
 * where each number (from the third on) is the sum of the previous two. 
 * Create a method that takes an integer as an argument and displays that many Fibonacci numbers starting from the beginning, 
 * e.g., If you run java Fibonacci 5 (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
 */
public class Exercise9 {

	public static void PrintFibonacci(int end) {
		int i = 1;
		int j = 1;
		System.out.print(i + ", " + j );
		int fiboVal = 1;
		while (i + j <= end) {
			fiboVal = i + j;
			System.out.print(", " + fiboVal);
			i = j;
			j = fiboVal;
		}
	}
}
