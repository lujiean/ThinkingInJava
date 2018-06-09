package com.thinkinginjava.reusingclasses;

/*
 * Exercise 2: (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called sterilize( ).
 */
import com.thinkinginjava.tools.*;
public class Exercise2 extends Detergent {

	public void scrub() {
		append(" Exercise2.scrub() ");
		super.scrub();
	}
	
	public void sterilize() {
		append(" Exercise2.sterilize() ");
	}
}

class Detergent extends Cleanser{
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
		}
}

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
	
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute(); x.apply(); x.scrub();
		Tools.Println(x.toString());
	}
}