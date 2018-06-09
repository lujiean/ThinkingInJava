package com.thinkinginjava.polymorphism;

public class Tricycle extends Cycle{

	@Override
	public String toString() {
		return "Tricycle";
	}
	
	@Override
	public int wheels() {
		return 3;
	}
}
