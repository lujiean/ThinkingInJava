package com.thinkinginjava.polymorphism;

public class Unicycle extends Cycle{

	@Override
	public String toString() {
		return "Unicycle";
	}
	
	@Override
	public int wheels() {
		return 1;
	}
	
	public void balance() {
		System.out.println("Unicycle.balance()");
	}
}
