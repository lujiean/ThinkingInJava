package com.thinkinginjava.polymorphism;

public class Bicycle extends Cycle{

	@Override
	public String toString() {
		return "Bicycle";
	}
	
	@Override
	public int wheels() {
		return 2;
	}
	
	public void balance() {
		System.out.println("Bicycle.balance()");
	}
}
