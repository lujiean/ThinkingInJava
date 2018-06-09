package com.thinkinginjava.IniClean;

import javax.tools.Tool;

import com.thinkinginjava.tools.*;
/*
 * Initialization & Cleanup
 */
public class Homework {

	public static void main(String[] args) {
		
		/*
		 * Exercise 1 
		 */
		Tools.PrintExercise(1);
		Exercise1 ex1 = new Exercise1();
		System.out.println("ex1 str ini = " + ex1.str);
		
		/*
		 * Exercise 2
		 */
		Tools.PrintExercise(2);
		Exercise2 ex2 = new Exercise2();
		System.out.println("str1 = " + ex2.str1 + " str2 = " + ex2.str2);
		
		/*
		 * Exercise3
		 */
		Tools.PrintExercise(3);
		Exercise3 ex3 = new Exercise3();
		
		/*
		 * Exercise 4
		 */
		Tools.PrintExercise(4);
		Exercise3 ex4 = new Exercise3("TEST STR");
		
		/*
		 * Exercise 5
		 */
		Tools.PrintExercise(5);
		Dog dog1 = new Dog();
		dog1.bark('A');
		dog1.bark(456);
		dog1.bark("HAHA");
		
		/*
		 * Exercise 6
		 */
		Tools.PrintExercise(6);
		dog1.bark('C', 8);
		dog1.bark(8, 'C');
		
		/*
		 * Exercise 7
		 */
		Tools.PrintExercise(7);
		Exercise7 ex7 = new Exercise7();
		
		/*
		 * Exercise 8
		 */
		Tools.PrintExercise(8);
		Exercise8 ex8 = new Exercise8();
		ex8.method1();
		ex8.method1p1();
		
		/*
		 * Exercise 9
		 */
		Tools.PrintExercise(9);
		Exercise9 ex9 = new Exercise9();
		
		/*
		 * Exercise 10
		 */
		Tools.PrintExercise(10);
		Exercise10 ex10 = new Exercise10(2);
		//ref : http://bbs.csdn.net/topics/370083720
		// it becomes null, when gc will call finalize
		
//		ex10 = null;
		ex10 = new Exercise10(10);
		System.gc();
		
		/*
		 * Exercise 12
		 */
		Tools.PrintExercise(12);
		Tank tank = new Tank();
		tank.Fullfill();
//		tank.Pickout();
		tank = null;
		System.gc();
		
		/*
		 * Exercise 14
		 */
		Tools.PrintExercise(14);
		Exercise14.PrintStatic();
		
		/*
		 * Exercise 15
		 */
		Tools.PrintExercise(15);
		new Exercise15();
		
		/*
		 * Exercise 16: (1) Create an array of String objects and assign a String to each element. Print the array by using a for loop.
		 */
		Tools.PrintExercise(16);
		String[] strArr = new String[] {"what", "is", "a", "pitty"};
		for(int i=0;i<=strArr.length - 1;i++) {
			Tools.Println(strArr[i]);
		}
		
		/*
		 * Exercise 19
		 */
		Tools.PrintExercise(19);
		Exercise19.PrintVarArg("what", "is", "the", "dog", "?");
		strArr = new String[]{"this", "is", "in", "array"};
		Exercise19.PrintVarArg(strArr);
		
		/*
		 * Exercise 20
		 */
		Tools.PrintExercise(20);
		Exercise20.main("hello", "this", "is");
		
		/*
		 * Exercise 21
		 */
		Tools.PrintExercise(21);
		for(Currency ccy : Currency.values()) {
			Tools.Println(ccy + " ordinal is " + ccy.ordinal());
		}
		
		/*
		 * Exercise 22
		 */
		Tools.PrintExercise(22);
		Exercise22 ex22 = new Exercise22(Currency.RMB);
		ex22.DisplayStatement();
		Exercise22 ex22_1 = new Exercise22(Currency.HKD);
		ex22_1.DisplayStatement();
		Exercise22 ex22_2 = new Exercise22(Currency.USD);
		ex22_2.DisplayStatement();
	}
}
