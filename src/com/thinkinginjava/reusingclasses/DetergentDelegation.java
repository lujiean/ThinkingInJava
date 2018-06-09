package com.thinkinginjava.reusingclasses;

import static com.thinkinginjava.tools.Tools.Println;

/*
 * Exercise 11: (3) Modify Detergent.java so that it uses delegation.
 */

class NewCleanser {
	private String s = "NewCleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
//	public static void main(String[] args) {
//		NewCleanser x = new NewCleanser();
//		x.dilute(); x.apply(); x.scrub();
//		Println(x.toString());
//	}
}

public class DetergentDelegation {

	private String s = "DetergentDelegation";
	private NewCleanser ncr = new NewCleanser();
	public void dilute() { ncr.append(" dilute()"); }
	public void apply() { ncr.append(" apply()"); }
	public void scrub() { ncr.append(" scrub()"); }
	
	public String toString() {
		return "DetergentDelegation s = " + s + "\n ncr s = " + ncr.toString();
	}
}
