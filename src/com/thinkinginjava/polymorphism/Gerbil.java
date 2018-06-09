package com.thinkinginjava.polymorphism;

//public class Gerbil extends Rodent{
public class Gerbil implements Rodent{

	private RodentShared rs;
	
	public Gerbil(RodentShared rs) {
		// TODO Auto-generated constructor stub
//		super(rs);
		System.out.println("Gerbil()");
		this.rs = rs;
	}
	
	public void bow() {
		System.out.println("Gerbil bow: hah");
	}
}
