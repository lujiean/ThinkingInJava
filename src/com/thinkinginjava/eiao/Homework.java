package com.thinkinginjava.eiao;

/*
 * Homework for Chapter: Everything Is an Object
 */
public class Homework {

	public static void main(String[] args) {
		
		/* Exercise1 */
		System.out.println("Exercise1");
		System.out.println("Default int = " + Exercise1.i);
		System.out.println("Defallt char = " + Exercise1.ch);
		
		/* Exercise3 */
		Exercise3 a = new Exercise3();
		
		/* Exercise4 */
		/* Exercise5 */
		System.out.println("Exercise4/5");
		DataOnly data = new DataOnly();
		data.i = 47;
		data.d = 1.1;
		data.b = false;
		System.out.println("i d b = " + data.i + " " + data.d + " " + data.b);
		
		/* Exercise6 */
		System.out.println("Execrise6");
		System.out.println("storage of Exercise6 = " + Exercise6.storage("Exercise6"));
		
		/* Exercise7 */
		System.out.println("Execrise7");
		System.out.println("before increment = " + StaticTest.i);
		Incrementable.increment();
		System.out.println("after increment = " + StaticTest.i);
		
		/* Exercise8 */
		System.out.println("Execrise8");
		Exercise8 exe8p1 = new Exercise8();
		System.out.println("i for exe8p1 = " + exe8p1.i);
		exe8p1.increment();
		System.out.println("after increment i for exe8p1 = " + exe8p1.i);
		Exercise8 exe8p2 = new Exercise8();
		System.out.println("i for exe8p2 = " + exe8p2.i);
		
		/* Exercise9 */
		System.out.println("Execrise9");
		//refer to page77 default value
		// byte, and short is 'smaller' then int(78, 67), transfer from int to short/byte should casting
		Exercise9.AutoBoxingTest(true, '\u0056', (byte)78, (short)67, 90, 65l, 7.1f, 8.97d);
		
		/* Exercise10 
		 * run parameter 2 3 4*/
		System.out.println("Execrise10");
		System.out.println("1 to 3 input para is " + args[0] + "-" + args[1] + "-" + args[2]);
		
		/* Exercise11 */
		System.out.println("Execrise11");
		AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
		System.out.println("the previous color of Rainbow = " + atc.anIntegerRepresentingColors);
		atc.changeTheHueOfTheColor(4);
		System.out.println("after change color, color of Ranbow = " + atc.anIntegerRepresentingColors);
		
		/* Exercise12 */
		// HelloDate.java 
		// build C:\Users\sqpz\Documents\Java>javadoc -encoding UTF-8 -charset UTF-8 HelloDate.java
		// build in eclipse Project -> generate javadoc
		
		/* Exercise13 */
		
		/* Exercise14 */
		//QA.javadoc can not gen <ol> <li> tab, to build list
		
		/* Exercise15 */
		/*
		 * Exercise 15: (1) Take the program in Exercise 2 and add comment documentation to it. 
		 * Extract this comment documentation into an HTML file using Javadoc and view it with your Web browser.
		 */
		
		/* Exercise16 */
		/*
		 * Exercise 16: (1) In the Initialization & Cleanup chapter, locate the Overloading.java example and add Javadoc documentation. 
		 * Extract this comment documentation into an HTML file using Javadoc and view it with your Web browser.
		 */
	}
}
