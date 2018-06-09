package com.thinkinginjava.controlexecute;

/*
 * Exercise 10: (5) A vampire number has an even number of digits and is formed by multiplying a pair of numbers containing half the number of digits of the result. 
 * The digits are taken from the original number in any order. 
 * Pairs of trailing zeroes are not allowed. Examples include:
	1260 = 21 * 60
	1827 = 21 * 87
	2187 = 27 * 81
	Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
	
	reference: http://blog.csdn.net/tianmijieguo/article/details/46400911
 */
public class Exercise10 {

	public static void VampireNumbers() {
		int i,j,k,l;
		for(int dig = 1000;dig<= 9999;dig++) {
			l = dig % 10;
			k = (dig / 10) % 10;
			j = (dig / 100) % 10;
			i = (dig / 1000) % 10;
			
			System.out.println("i j k l: " + i + " " + j + " " + k + " " + l);
			
			// (a*10+b)*(c*10+d)
			
		}
	}
}
