package com.thinkinginjava.operators;

import static java.lang.System.out;
import static com.thinkinginjava.operators.Exercise13.*;
public class Homework {

	public static void main(String[] args) {
		/*
		 * Exercise1
		 */
		System.out.println("###Exercise1###");
		Exercise1.testprint();
		
		/*
		 * Exercise2
		 */
		System.out.println("###Exercise2###");
		Exercise2 e21 = new Exercise2();
		Exercise2 e22 = new Exercise2();
		
		e21.f = 2.33f;
		e22.f = 9.46f;
		System.out.println("e21.f = " + e21.f + "; e22.f = " + e22.f);
		
		e21 = e22;
		System.out.println("e21.f = " + e21.f + "; e22.f = " + e22.f);
		
		e21.f = 1.46f;
		System.out.println("e21.f = " + e21.f + "; e22.f = " + e22.f);
		
		/*
		 * Exercise3
		 */
		System.out.println("###Exercise3###");
		Exercise3 ex3 = new Exercise3();
		ex3.f = 80;
		
		System.out.println("ex3.f = " + ex3.f);
		SetExercise2Val(ex3);
		System.out.println("ex3.f after set = " + ex3.f);
		
		/*
		 * Exercis4
		 */
		System.out.println("###Exercise4###");
		out.println("distance is " + Exercise4.distance);
		out.println("time is " + Exercise4.time);
		System.out.println("velocity is " + Exercise4.CalVelocity());
		
		/*
		 * Exercise 5: (2) Create a class called Dog containing two Strings: name and says. 
		 * In main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). 
		 * Then display their names and what they say.
		 */
		System.out.println("###Exercise5###");
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.name = "spot";
		dog1.says = "Ruff!";
		
		dog2.name = "scruffy";
		dog2.says = "Wurf!";
		
		System.out.println("dog1 name = " + dog1.name + ", says = " + dog1.says);
		System.out.println("dog2 name = " + dog2.name + ", says = " + dog2.says);
		
		/*
		 * Exercise 6: (3) Following Exercise 5, create a new Dog reference and assign it to spot’s object. 
		 * Test for comparison using == and equals( ) for all references.
		 */
		System.out.println("###Exercise6###");
		Dog dog3 =new Dog();
		dog1 = dog3;
		System.out.println("test = ");
//		if(dog1 == dog2)
//			System.out.println("dog1 == dog2");
//		else
//			System.out.println("dog1 <> dog2");
		
		System.out.println((dog1 == dog2) + " " +  (dog1 == dog3) + " " +  (dog2 == dog3));
		
//		if(dog1 == dog3)
//			System.out.println("dog1 == dog3");
//		else
//			System.out.println("dog1 <> dog3");
//		
//		if(dog2 == dog3)
//			System.out.println("dog2 == dog3");
//		else
//			System.out.println("dog2 <> dog3");
		
		System.out.println("test equals");
		System.out.println(dog1.equals(dog2) + " " + dog1.equals(dog3) + " " + dog2.equals(dog3));
//		if(dog1.equals(dog2))
//			System.out.println("dog1 equals dog2");
//		else
//			System.out.println("dog1 not equals dog2");
//		
//		if(dog1.equals(dog3))
//			System.out.println("dog1 equals dog3");
//		else
//			System.out.println("dog1 not equals dog3");
//		
//		if(dog2.equals(dog3))
//			System.out.println("dog2 equals dog3");
//		else
//			System.out.println("dog2 not equals dog3");
		
		//! 
		
		/*
		 * Exercise 7: (3) Write a program that simulates coin-flipping.
		 */
		System.out.println("### Exercise7 ###");
		System.out.println("Coin in front is " + Coin.flip());
		
		/*
		 * Exercise 8: (2) Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the results.
		 */
		System.out.println("### Exercise8 ###");
		
		long l1 = 200L;
		long l1hex = 0x2fL;
		long l1oct = 0177;
		System.out.println("l1 binary is " + Long.toBinaryString(l1));
		System.out.println("l1hex binary is " + Long.toBinaryString(l1hex));
		System.out.println("l1oct binary is " + Long.toBinaryString(l1oct));
		
		/*
		 * Exercise 9: (1) Display the largest and smallest numbers for both float and double exponential notation.
		 * 
		 * ref: 
		    float：
			1bit（符号位）
			8bits（指数位）
			23bits（尾数位）
			
			double：
			1bit（符号位）
			11bits（指数位）
			52bits（尾数位）
			
			http://blog.sina.com.cn/s/blog_69a531dc0101qef0.html
		 */
		System.out.println("### Exercise9 ###");
		
//		float maxfloat = (2^23 -1)e(2^8-1);
//		float maxfloat = 8388607e+127f;
		System.out.println("max float = " + Float.MAX_VALUE);
		System.out.println("min float = " + Float.MIN_VALUE);
		System.out.println("max double = " + Double.MAX_VALUE);
		System.out.println("min double = " + Double.MIN_VALUE);
		
		/*
		 * Exercise10
		 */
		System.out.println("### Exercise10 ###");
		Exercise10.oprate();
		
		/*
		 * Exercise 11: (3) Start with a number that has a binary one in the most significant position (hint: Use a hexadecimal constant). 
		 * Using the signed right-shift operator, right shift it all the way through all of its binary positions, 
		 * each time displaying the result using Integer.toBinaryString( ).
		 */
		System.out.println("### Exercise11 ###");
		int e11 = 0x17;
		System.out.println("e11 = " + Integer.toBinaryString(e11));
		while(e11 != 0)
		{
			e11 >>= 1;
			System.out.println("e11 right shift = " + Integer.toBinaryString(e11));
		}
		
		/*
		 * Exercise 12: (3) Start with a number that is all binary ones. 
		 * Left shift it, then use the unsigned right-shift operator to right shift through all of its binary positions, 
		 * each time displaying the result using Integer.toBinaryString( ).
		 */
		System.out.println("### Exercise12 ###");
		int e12 = - 0x05;
		System.out.println("e12 = " + Integer.toBinaryString(e12));
		e12 <<= 2;
		System.out.println("e12 left shift = " + Integer.toBinaryString(e12));
		e12 >>>= 4;
		// insert zero even is negative,( 0 not desplay) 
		// >> will insert 1 
		System.out.println("e12 right shift = " + Integer.toBinaryString(e12));
		
		/*
		 * Exercise 13
		 */
		System.out.println("### Exercise13 ###");
		char ch13 = '0';
		System.out.println(ch13 + " bin = " + Exercise13.DisplayCharBin(ch13));
		out.println("short print = " + DisplayCharBin('H'));
		
		/*
		 * Exercise 14
		 */
		System.out.println("### Exercise14 ###");
		out.println("compare1");
		Exercise14.BooleanCompareWithStrings("abc", "abc");
		out.println("compare2");
		Exercise14.BooleanCompareWithStrings("abc", "abdc");
		String str1 = new String("abc");
		String str2 = new String("abc");
		out.println("compare3");
		Exercise14.BooleanCompareWithStrings(str1, str2);
	}
	
	public static void SetExercise2Val(Exercise3 ex3) {
		ex3.f = 90f;
	}
	
}
