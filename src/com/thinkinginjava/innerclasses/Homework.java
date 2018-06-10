package com.thinkinginjava.innerclasses;

/*
 * Inner Classes
 */

import static com.thinkinginjava.tools.Tools.*;

import com.thinkinginjava.innerclasses.Outer.Inner;
import com.thinkinginjava.innerclasses.Sequence.SequenceSelector;
import com.thinkinginjava.innerclasses3.Ex6_3;

public class Homework {

	public static void main(String[] args) {
		
		/*
		 * Exercise 1: (1) Write a class named Outer that contains an inner class named Inner. 
		 * Add a method to Outer that returns an object of type Inner. 
		 * In main( ), create and initialize a reference to an Inner.
		 */
		PrintExercise(1);
		Outer outer = new Outer();
		Inner ex1 = outer.getInner();
		
		/*
		 * Exercise 2: (1) Create a class that holds a String, and has a toString( ) method that displays this String. 
		 * Add several instances of your new class to a Sequence object, then display them.
		 */
		PrintExercise(2);
		Sequence sequence = new Sequence(3);
		Ex2[] ex2 = {new Ex2("z"), new Ex2("a"), new Ex2("x")};
		for(int i = 0; i< ex2.length; i++)
			sequence.add(ex2[i]);
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		System.out.println();
		
		/*
		 * Exercise 3: (1) Modify Exercise 1 so that Outer has a private String field (initialized by the constructor), 
		 * and Inner has a toString( ) that displays this field. 
		 * Create an object of type Inner and display it.
		 */
		PrintExercise(3);
		Outer outer3 = new Outer("test str");
		Inner ex3 = outer3.getInner();
		System.out.println(ex3);
		
		/*
		 * Exercise 4: (2) Add a method to the class Sequence.SequenceSelector that produces the reference to the outer class Sequence.
		 */
		PrintExercise(4);
		Sequence seq4 = new Sequence(7);
		Sequence.SequenceSelector ss4 = (SequenceSelector)seq4.selector();
		ss4.outer().pEx4();
		
		/*
		 * Exercise 5: (1) Create a class with an inner class. In a separate class, make an instance of the inner class.
		 */
		PrintExercise(5);
		Ex5 ex5 = new Ex5();
		Ex5.Ex5Inner ex5in = ex5.new Ex5Inner();
		ex5in.pEx5Inner();
		
		/*
		 * Exercise 6: (2) Create an interface with at least one method, in its own package. 
		 * Create a class in a separate package. 
		 * Add a protected inner class that implements the interface. 
		 * In a third package, inherit from your class and, inside a method, return an object of the protected inner class, upcasting to the interface during the return.
		 */
		PrintExercise(6);
		Ex6_3 ex6_3 = new Ex6_3();
		ex6_3.func1().func1();
		
		/*
		 * Exercise 7: (2) Create a class with a private field and a private method. 
		 * Create an inner class with a method that modifies the outer-class field and calls the outer-class method. 
		 * In a second outer-class method, create an object of the inner class and call its method, then show the effect on the outer-class object.
		 */
		PrintExercise(7);
		Ex7.main(null);
		
		/*
		 * Exercise 8: (2) Determine whether an outer class has access to the private elements of its inner class.
		 */
		PrintExercise(8);
		Ex8.func1();
		
		/*
		 * Exercise 9: (1) Create an interface with at least one method, and implement that interface by defining an inner class within a method, 
		 * which returns a reference to your interface.
		 */
		PrintExercise(9);
		ItfEx9 ex9 = func1();
		ex9.func1();
		
		/*
		 * Exercise 10: (1) Repeat the previous exercise but define the inner class within a scope within a method.
		 */
		PrintExercise(10);
		ItfEx9 ex10 = func2(9);
		ex10.func1();
		ItfEx9 ex10_1 = func2(1);
		ex10_1.func1();
		
		/*
		 * Exercise 11: (2) Create a private inner class that implements a public interface. 
		 * Write a method that returns a reference to an instance of the private inner class, upcast to the interface. 
		 * Show that the inner class is completely hidden by trying to downcast to it.
		 */
		PrintExercise(11);
		Ex11 ex11 = new Ex11();
		ex11.func2().func1();
		
		/*
		 * Exercise 12: (1) Repeat Exercise 7 using an anonymous inner class.
		 */
		PrintExercise(12);
		Ex12.main(null);
		
		/*
		 * Exercise 13: (1) Repeat Exercise 9 using an anonymous inner class.
		 */
		PrintExercise(13);
		ItfEx9 ex13 = Ex13func3();
		ex13.func1();
		
		/*
		 * Exercise 14: (1) Modify interfaces/HorrorShow.java to implement DangerousMonster and Vampire using anonymous classes.
		 */
		PrintExercise(14);
		
		/*
		 * Exercise 15: (2) Create a class with a non-default constructor (one with arguments) and no default constructor (no "no-arg" constructor). 
		 * Create a second class that has a method that returns a reference to an object of the first class. 
		 * Create the object that you return by making an anonymous inner class that inherits from the first class.
		 */
		PrintExercise(15);
		Ex15 ex15 = new Ex15();
		Ex15Base ex15base = ex15.func1(99);
		
		/*
		 * Exercise 16: (1) Modify the solution to Exercise 18 from the Interfaces chapter to use anonymous inner classes.
		 */
		PrintExercise(16);
		Ex16.main(null);
		
		/*
		 * Exercise 17: (1) Modify the solution to Exercise 19 from the Interfaces chapter to use anonymous inner classes.
		 */
		PrintExercise(17);
		Ex17.main(null);
		
		/*
		 * Exercise 18: (1) Create a class containing a nested class. In main( ), create an instance of the nested class.
		 */
		PrintExercise(18);
		Ex18.main(null);
		
		/*
		 * Exercise 19: (2) Create a class containing an inner class that itself contains an inner class. 
		 * Repeat this using nested classes. 
		 * Note the names of the .class files produced by the compiler.
		 */
		PrintExercise(19);
		Ex19.Ex19_in.Ex19_in_in.func1();
		
		/*
		 * Exercise 20: (1) Create an interface containing a nested class. 
		 * Implement this interface and create an instance of the nested class.
		 */
		PrintExercise(20);
		ItfEx20.ItfEx20_in.main(null);
		
		/*
		 * Exercise 21: (2) Create an interface that contains a nested class that has a static method that calls the methods of your interface and displays the results. 
		 * Implement your interface and pass an instance of your implementation to the method.
		 */
		PrintExercise(21);
		ItfEx21.ItfEx21_in.main(null);
		
		/*
		 * Exercise 22: (2) Implement reverseSelector( ) in Sequence.java.
		 */
		PrintExercise(22);
		Sequence.main(null);
		
		/*
		 * Exercise 23: (4) Create an interface U with three methods. 
		 * Create a class A with a method that produces a reference to a U by building an anonymous inner class. 
		 * Create a second class B that contains an array of U. 
		 * B should have one method that accepts and stores a reference to a U in the array, 
		 * a second method that sets a reference in the array (specified by the method argument) to null, 
		 * and a third method that moves through the array and calls the methods in U. 
		 * In main( ), create a group of A objects and a single B. 
		 * Fill the B with U references produced by the A objects. 
		 * Use the B to call back into all the A objects. 
		 * Remove some of the U references from the B.
		 */
		PrintExercise(23);
		
		
	}
	
	public static ItfEx9 Ex13func3() {
		return new ItfEx9() {
			public void func1() {
				System.out.println("ItfEx9.Ex13func3.func1()");
			}
		};
	}
	
	public static ItfEx9 func1() {
		class Ex9 implements ItfEx9{
			public void func1() {
				System.out.println("Ex9.func1()");
			}
		}
		return new Ex9();
	}
	
	public static ItfEx9 func2(int i) {
		if (i == 1)
		{
			class Ex9 implements ItfEx9{
				public void func1() {
					System.out.println("Ex9.func2() + " + i);
				}
			}
			return new Ex9();
		}
		else
		{
			class Ex9 implements ItfEx9{
				public void func1() {
					System.out.println("Ex9.else + " + i);
				}
			}
			return new Ex9();
		}
		
//		else
//		{
//			class Ex9 implements ItfEx9{
//				public void func1() {
//					System.out.println("Ex9.func2()");
//				}
//			}
//			return new Ex9();
//		}
	}
}
