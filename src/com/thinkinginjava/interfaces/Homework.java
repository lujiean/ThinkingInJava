package com.thinkinginjava.interfaces;

/*
 * Interfaces
 */
import static com.thinkinginjava.tools.Tools.*;

import java.util.Scanner;

import com.thinkinginjava.polymorphism.*;
import com.thinkinginjava.interfaces2.*;

public class Homework {

	public static void main(String[] args) {
		
		/*
		 * Exercise 1: (1) Modify Exercise 9 in the previous chapter so that Rodent is an abstract class. 
		 * Make the methods of Rodent abstract whenever possible.
		 */
		PrintExercise(1);
//		Rodent rod = new Rodent();
		RodentShared rs = new RodentShared();
		Rodent rod = new Gerbil(rs);
		rod.bow();
		
		/*
		 * Exercise 2: (1) Create a class as abstract without including any abstract methods and verify that you cannot create any instances of that class.
		 */
		PrintExercise(2);
		//have err
//		AbsEx2 ex2 = new AbsEx2();
		
		/*
		 * Exercise 3: (2) Create a base class with an abstract print( ) method that is overridden in a derived class. 
		 * The overridden version of the method prints the value of an int variable defined in the derived class. 
		 * At the point of definition of this variable, give it a nonzero value. 
		 * In the base-class constructor, call this method. 
		 * In main( ), create an object of the derived type, and then call its print( ) method. Explain the results.
		 */
		PrintExercise(3);
		Ex3 ex3 = new Ex3();
		ex3.print();
		
		/*
		 * Exercise 4: (3) Create an abstract class with no methods. 
		 * Derive a class and add a method. 
		 * Create a static method that takes a reference to the base class, downcasts it to the derived class, and calls the method. 
		 * In main( ), demonstrate that it works. 
		 * Now put the abstract declaration for the method in the base class, thus eliminating the need for the downcast.
		 */
		PrintExercise(4);
		Ex4.stcFunc2();
		
		/*
		 * Exercise 5: (2) Create an interface containing three methods, in its own package. Implement the interface in a different package.
		 */
		PrintExercise(5);
		ItfEx5 ex5 = new Ex5();
		ex5.func1();
		ex5.func2();
		ex5.func3();
		
		/*
		 * Exercise 6: (2) Prove that all the methods in an interface are automatically public.
		 */
		PrintExercise(6);
		ItfEx6 ex6 =new Ex6();
		ex6.func1();
		
		/*
		 * Exercise 7: (1) Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.
		 */
		PrintExercise(7);
		Rodent rod7 = new Hamster(rs);
		rod7.bow();
		
		/*
		 * Exercise 8: (2) In polymorphism.Sandwich.java, 
		 * create an interface called FastFood (with appropriate methods) and change Sandwich so that it also implements FastFood.
		 */
		PrintExercise(8);
		Sandwich s = new Sandwich();
		s.Eat();
		
		/*
		 * Exercise 9: (3) Refactor Musics.java by moving the common methods in Wind, Percussion and Stringed into an abstract class.
		 * refer to Music3.java
		 */
		PrintExercise(9);
		
		/*
		 * Exercise 10: (3) Modify Musics.java by adding a Playable interface. 
		 * Move the play( ) declaration from Instrument to Playable. 
		 * Add Playable to the derived classes by including it in the implement s list. 
		 * Change tune( ) so that it takes a Playable instead of an Instrument.
		 * refer to Music3.java
		 */
		PrintExercise(10);
		
		/*
		 * Exercise 11: (4) Create a class with a method that takes a String argument and produces a result that swaps each pair of characters in that argument. 
		 * Adapt the class so that it works with interfaceprocessor.Apply.process( ).
		 * refer to Apply.java
		 */
		PrintExercise(11);
		
		/*
		 * Exercise 12: (2) In Adventure.java, add an interface called CanClimb, following the form of the other interfaces.
		 * refer to Adventure.java
		 */
		PrintExercise(12);
		
		/*
		 * Exercise 13: (2) Create an interface, and inherit two new interfaces from that interface. 
		 * Multiply inherit a third interface from the second two.
		 */
		PrintExercise(13);
		
		/*
		 * Exercise 14: (2) Create three interfaces, each with two methods. 
		 * Inherit a new interface that combines the three, adding a new method. 
		 * Create a class by implementing the new interface and also inheriting from a concrete class. 
		 * Now write four methods, each of which takes one of the four interfaces as an argument. 
		 * In main( ), create an object of your class and pass it to each of the methods.
		 */
		PrintExercise(14);
		Ex14 ex14 = new Ex14();
		Ex14.processA(ex14);
		Ex14.processB(ex14);
		Ex14.processC(ex14);
		Ex14.processABC(ex14);
		
		/*
		 * Exercise 15: (2) Modify the previous exercise by creating an abstract class and inheriting that into the derived class.
		 */
		PrintExercise(15);
		
		//str = "ABCDEFG"
		//ord = "0123456"
		// use str[int.rand[str.length]] get random str char
		//same as store "ABCDEFG" into a array and use index to get.
		
		/*
		 * Exercise 16: (3) Create a class that produces a sequence of chars. Adapt this class so that it can be an input to a Scanner object.
		 */
		PrintExercise(16);
		Ex16 ex16 = new Ex16("hello Ex16");
		Scanner sc = new Scanner(ex16);
		while(sc.hasNext())
			System.out.println(sc.next());
		
		/*
		 * Exercise 17: (2) Prove that the fields in an interface are implicitly static and final.
		 */
		PrintExercise(17);
		Ex17 ex17 = new Ex17();
		System.out.println(ex17.INT_dyn);
		//can not assign - final
//		ex17.INT_1 = 10;
		Ex17 ex17_1 = new Ex17();
		System.out.println(ex17.INT_dyn);
//		Integer.
		System.out.println(ItfEx17.str);
		
		/*
		 * Exercise 18: (2) Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. 
		 * Create factories for each type of Cycle, and code that uses these factories.
		 */
		PrintExercise(18);
		Ex18.main(null);
		
		/*
		 * Exercise 19: (3) Create a framework using Factory Methods that performs both coin tossing and dice tossing.
		 */
		PrintExercise(19);
		Ex19.main(null);
		
	}
}
