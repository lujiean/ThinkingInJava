package com.thinkinginjava.reusingclasses;

import java.util.Scanner;

/*
 * Reusing Classes
 */
import com.thinkinginjava.tools.*;

public class Homework {

	public static void main(String[] args) {
		
		/*
		 * Exercise 1
		 */
		Tools.PrintExercise(1);
		Exercise1 ex1 = new Exercise1();
		Tools.Println("Print ex1:" + ex1);
		
		/*
		 * Exercise 2
		 */
		Tools.PrintExercise(2);
		Exercise2 ex2 = new Exercise2();
		ex2.scrub();
		
		/*
		 * Exerise 3
		 */
		Tools.PrintExercise(3);
		Cartoon ct1 = new Cartoon();
		
		/*
		 * Exercise 5
		 */
		Tools.PrintExercise(5);
		C c = new C();
		
		/*
		 * Exercise 6
		 */
		Tools.PrintExercise(6);
		Chess chess = new Chess();
		
		/*
		 * Exercise 7
		 */
		Tools.PrintExercise(7);
		C c1 = new C(10);
		
		/*
		 * Exercise 8
		 */
		Tools.PrintExercise(8);
		Exercise8 ex8 = new Exercise8();
		ex8 = new Exercise8(10);
		
		/*
		 * Exercise 9
		 */
		Tools.PrintExercise(9);
		//ref to ex10
//		Stem st = new Stem();
		
		/*
		 * Exercise 10
		 */
		Tools.PrintExercise(10);
		Stem st = new Stem(90);
		
		/*
		 * Exercise 11
		 */
		Tools.PrintExercise(11);
		DetergentDelegation dd = new DetergentDelegation();
		dd.apply();
		dd.dilute();
		Tools.Println(dd.toString());
		
		/*
		 * Exercise 12
		 */
		Tools.PrintExercise(12);
		Stem st1 = new Stem(12);
		try {
			
		} finally {
			// TODO: handle finally clause
			st1.dispose(12);
		}
		
		/*
		 * Exercise 13
		 */
		Tools.PrintExercise(13);
		Exercise13 ex13 = new Exercise13();
		ex13.PrintOVL("hello");
		ex13.PrintOVL('b');
		ex13.PrintOVL(2.3f);
		ex13.PrintOVL(89);
		
		/*
		 * cise 14
		 */
		Tools.PrintExercise(14);
		Car car = new Car();
		car.engine.service();
		
		/*
		 * Exercise 15
		 */
		Tools.PrintExercise(15);
		Exercise15 ex15 = new Exercise15();
		ex15.PrintProtect();
		Exercise15sub ex15sub = new Exercise15sub();
		ex15sub.Print15();
		
		/*
		 * Exercise 16
		 * Exercise 17
		 */
		Tools.PrintExercise(16);
		Frog frog = new Frog();
		frog.climb(frog);
		
		/*
		 * Exercise 18
		 */
		Tools.PrintExercise(18);
		Exercise18 ex18 = new Exercise18();
		Exercise18 ex18_1 = new Exercise18();
		Tools.Println("" + ex18);
		Tools.Println("" + ex18_1);
		
		/*
		 *  19
		 */
		Tools.PrintExercise(19);
		Exercise19 ex19 = new Exercise19(79);
		Tools.Println("ex19: " + ex19.cmp.i);
		// can not change
//		ex19.cmp = new compo1(8);
		ex19.cmp.i = 80;
		// can change the value in the ref
		Tools.Println("ex19: " + ex19.cmp.i);
		
		/*
		 * Exercise 20
		 */
		Tools.PrintExercise(20);
		//refer to FinalOverridingIllusion
		
		/*
		 * Exercise 21
		 */
		Tools.PrintExercise(21);
		// refer to Exercise21
		// private function => all final function and can not be override : add @Override and check whether is truely Override
		// final function not => all private
		
		/*
		 * Exercise 22
		 */
		Tools.PrintExercise(22);
		
		/*
		 * Exercise 23
		 */
		Tools.PrintExercise(23);
		Tools.Print("input option: ");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		if (1 == option) {
			Exercise23 ex23 = new Exercise23();
			Exercise23 ex23_2 = new Exercise23();
			// only initialize static ( load class) once
		}
		else
			Exercise23.PrintStaticI();
		// direct call static func let it initialize
		
		/*
		 * Exercise 24
		 */
		Tools.PrintExercise(24);
//		System.out.println("Beetle constructor");
//		Beetle b = new Beetle();
		
		System.out.println("Exercise24 constructor");
		Exercise24 ex24 = new Exercise24();
	}
}
