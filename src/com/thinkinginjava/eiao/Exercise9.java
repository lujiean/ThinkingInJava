package com.thinkinginjava.eiao;

/*
 * Exercise 9: (2) Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.
 */
public class Exercise9 {

	static void AutoBoxingTest(boolean bo, char ch, byte b, short sh, int i, long l, float f,double d) {
		//AutoBoxing
		Boolean BO = bo;
		Character CH = ch;
		Byte B = b;
		Short SH = sh;
		Integer I = i;
		Long L = l;
		Float F = f;
		Double D = d;
		Void V = null;
		
		System.out.println("value of boolean bo = " + BO.booleanValue());
		System.out.println("value of char ch = " + CH.charValue());
		System.out.println("value of byte b = " + B.byteValue());
		System.out.println("value of short sh = " + SH.shortValue());
		System.out.println("value of int i = " + I.intValue());
		System.out.println("value of long l = " + L.longValue());
		System.out.println("value of float f = " + F.floatValue());
		System.out.println("value of double d = " + D.doubleValue());
		//System.out.println("value of void V = " + V.toString());
	}
}
