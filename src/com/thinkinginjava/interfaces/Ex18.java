package com.thinkinginjava.interfaces;

/*
 * Exercise 18: (2) Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. 
 * Create factories for each type of Cycle, and code that uses these factories.
 */
interface ItfCycle{
	String getName();
}

interface ItfCycleFactory{
	ItfCycle GetCycle();
}

class Unicycle implements ItfCycle{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "produce Unicycle";
	}
	
}

class Bicycle implements ItfCycle{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "produce Bicycle";
	}
	
}

class Tricycle implements ItfCycle{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "produce Tricycle";
	}
	
}

class UnicycleFactory implements ItfCycleFactory{
	public ItfCycle GetCycle() {
		return new  Unicycle();
	}
}

class BicycleFactory implements ItfCycleFactory{
	public ItfCycle GetCycle() {
		return new Bicycle();
	}
}

class TricycleFactory implements ItfCycleFactory{
	public ItfCycle GetCycle() {
		return new Tricycle();
	}
}

public class Ex18 {

	public static void ProduceCycle(ItfCycleFactory icf){
		System.out.println(icf.GetCycle().getName());
	}
	
	public static void main(String[] args) {
		ProduceCycle(new UnicycleFactory());
		ProduceCycle(new BicycleFactory());
		ProduceCycle(new TricycleFactory());
	}
}
