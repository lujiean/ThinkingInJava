package com.thinkinginjava.operators;

/*
 * Exercise 14: (3) Write a method that takes two String arguments and uses all the boolean comparisons to compare the two Strings and print the results. 
 * For the == and !=, also perform the equals( ) test. In main( ), call your method with some different String objects.
 */
public class Exercise14 {

	public static void BooleanCompareWithStrings(String str1, String str2) {
		
		if(str1 == str2)
			System.out.println("str1 == str2");
		
		if(str1 != str2)
			System.out.println("str1 != str2");
		
		if(str1.equals(str2))
			System.out.println("str1 equals str2");
	}
}
