package com.thinkinginjava.polymorphism;

/*
 * Exercise 11: (1) Add class Pickle to Sandwich.java.
 */
import static com.thinkinginjava.tools.Tools.*;

interface FastFood{
	public void Eat();
}
class Meal {
	Meal() { print("Meal()"); }
}

//class Bread {
class Bread implements FastFood{
	Bread() { print("Bread()"); }
	
	public void Eat() {
		print("Bread.Eat()");
	}
}

//class Cheese {
class Cheese implements FastFood{
	Cheese() { print("Cheese()"); }
	
	public void Eat() {
		print("Cheese.Eat()");
	}
}

//class Lettuce {
class Lettuce implements FastFood{
	Lettuce() { print("Lettuce()"); }
	
	public void Eat() {
		print("Lettuce.Eat()");
	}
}

//class Pickle {
class Pickle implements FastFood{
	Pickle() { print("Pickle()"); }
	
	public void Eat() {
		print("Pickle.Eat()");
	}
}
class Lunch extends Meal {
	Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
	PortableLunch() { print("PortableLunch()");}
}
public class Sandwich extends PortableLunch implements FastFood{
//	private Bread b = new Bread();
//	private Cheese c = new Cheese();
//	private Lettuce l = new Lettuce();
//	private Pickle p = new Pickle();
	private FastFood b = new Bread();
	private FastFood c = new Cheese();
	private FastFood l = new Lettuce();
	private FastFood p = new Pickle();
	
	public Sandwich() { print("Sandwich()"); }
	
	public void Eat() {
		print("Sandwich.Eat()");
		b.Eat();
		c.Eat();
		l.Eat();
		p.Eat();
	}
}
