package com.thinkinginjava.operators;

/*
 * Exercise 10: (3) Write a program with two constant values, one with alternating binary ones and zeroes, with a zero in the least-significant digit, 
 * and the second, also alternating, with a one in the least-significant digit 
 * (hint: It¡¯s easiest to use hexadecimal constants for this). 
 * Take these two values and combine them in all possible ways using the bitwise operators, and display the results using Integer.toBinaryString( ).
 */
public class Exercise10 {

	public static int int1 = 0X010;
	public static int int2 = 0x001;
	
	public static void oprate() {
		int int3;
		int3 = int1 & int2;
		System.out.println("int1 binaray is " + Integer.toBinaryString(int1));
		System.out.println("int2 binaray is " + Integer.toBinaryString(int2));
		System.out.println("int1 & int2 = " + Integer.toBinaryString(int3));
		
		System.out.println("int 1 | int2 = " + Integer.toBinaryString(int1 | int2));
		System.out.println("int 1 XOR int2 " + Integer.toBinaryString(int1 ^ int2));
		System.out.println("int 1 ~ = " + Integer.toBinaryString(~ int1));
	}
}
