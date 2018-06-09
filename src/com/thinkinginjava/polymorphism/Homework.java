package com.thinkinginjava.polymorphism;

/*
 * Polymorphism
 */

import com.thinkinginjava.tools.*;
public class Homework {

	private static RandomShapeGenerator gen =
			new RandomShapeGenerator();
	public static void main(String[] args) {
		
		/*
		 * Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. 
		 * Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
		 */
		Tools.PrintExercise(1);
		Unicycle uni = new Unicycle();
		Bicycle bic = new Bicycle();
		Tricycle tri = new Tricycle();
		ride(uni);
		ride(bic);
		ride(tri);
		
		/*
		 * Exercise 2: (1) Add the @Override annotation to the shapes example.
		 */
		
		Tools.PrintExercise(2);
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for(int i = 0; i < s.length; i++)
		s[i] = gen.next();
		// Make polymorphic method calls:
		for(Shape shp : s)
		shp.draw();
		
		/*
		 * Exercise 3: (1) Add a new method in the base class of Shapes.java that prints a message, but don¡¯t override it in the derived classes. 
		 * Explain what happens. 
		 * Now override it in one of the derived classes but not the others, and see what happens. 
		 * Finally, override it in all the derived classes.
		 */
		Tools.PrintExercise(3);
		for(Shape shp : s)
		shp.func_type1();
		// all call Shape func_type1
		Tools.Println("------");
		for(Shape shp : s)
		shp.func_type2();
		// Circle will call its func_type2, others call Shape
		Tools.Println("------");
		for(Shape shp : s)
		shp.func_type3();
		// all call its func_type3
		
		/*
		 * Exercise 4: (2) Add a new type of Shape to Shapes.java and verify in main( ) that polymorphism works for your new type as it does in the old types.
		 */
		Tools.PrintExercise(4);
		Shape shp_ex4 = new Pentagon();
		shp_ex4.func_type3();
		
		/*
		 * Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels. 
		 * Modify ride( ) to call wheels( ) and verify that polymorphism works.
		 */
		Tools.PrintExercise(5);
		ride(uni);
		ride(bic);
		ride(tri);
		
		/*
		 * Exercise 6 - 8, Music3.java
		 */
		
		/*
		 * Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. 
		 * In the base class, provide methods that are common to all Rodents, 
		 * and override these in the derived classes to perform different behaviors depending on the specific type of Rodent. 
		 * Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens.
		 */
		Tools.PrintExercise(9);
		RodentShared rs = new RodentShared();
		Rodent[] rodents = { new Mouse(rs), new Gerbil(rs), new Hamster(rs) };
		for(Rodent rod : rodents) {
			rod.bow();
		}
		
		/*
		 * Exercise 10: (3) Create a base class with two methods. In the first method, call the second method. 
		 * Inherit a class and override the second method. Create an object of the derived class, upcast it to the base type, 
		 * and call the first method. Explain what happens.
		 */
		Tools.PrintExercise(10);
		Exercise10Base exb10 = new Exercise10();
		exb10.func1();
		
		/*
		 * Exercise 11: (1) Add class Pickle to Sandwich.java.
		 */
		Tools.PrintExercise(11);
		new Sandwich();
		
		/*
		 * Exercise 12: (3) Modify Exercise 9 so that it demonstrates the order of initialization of the base classes and derived classes. 
		 * Now add member objects to both the base and derived classes and show the order in which their initialization occurs during construction.
		 */
		Tools.PrintExercise(12);
		new Zoo(rs);
		
		/*
		 * Exercise 13: refer to ReferenceCounting
		 */
		Tools.PrintExercise(13);
		
		/*
		 * Exercise 14: (4) Modify Exercise 12 so that one of the member objects is a shared object with reference counting, 
		 * and demonstrate that it works properly.
		 */
		Tools.PrintExercise(14);
		Tools.Println(RodentShared.getRodentCnt());
		
		/*
		 * Exercise 15: (2) Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem described in this section.
		 * refer to : PolyConstructors.java
		 */
		Tools.PrintExercise(15);
		
		/*
		 * Exercise 16: (3) Following the example in Transmogrify.java, 
		 * create a Starship class containing an AlertStatus reference that can indicate three different states. 
		 * Include methods to change the states.
		 */
		Tools.PrintExercise(16);
		Starship ss = new Starship();
		ss.Run();
		ss.Stop();
		ss.TurnLeft();
		
		/*
		 * Exercise 17: (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. 
		 * Create instances of all three types and upcast them to an array of Cycle. 
		 * Try to call balance( ) on each element of the array and observe the results. 
		 * Downcast and call balance( ) and observe what happens.
		 */
		Tools.PrintExercise(17);
		Cycle[] cyclelist = {new Bicycle(), new Tricycle(), new Unicycle()};
		
		// all have errors no balance() method for Cycle
//		cyclelist[0].balance();
//		cyclelist[1].balance();
//		cyclelist[2].balance();
		
		((Bicycle)cyclelist[0]).balance();
		// no this method for Tricycle
//		((Tricycle)cyclelist[1]).balance();
		((Unicycle)cyclelist[2]).balance();
		
	}
	
	public static void ride(Cycle c) {
		Tools.Println("ride: " + c + ", wheels: " + c.wheels());
	}
}
