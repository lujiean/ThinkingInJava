package com.thinkinginjava.polymorphism;

//public class Hamster extends Rodent{
public class Hamster implements Rodent{

	private RodentShared rs;
	public Hamster(RodentShared rs) {
		// TODO Auto-generated constructor stub
//		super(rs);
		System.out.println("Hamster()");
		this.rs =rs;
	}
	public void bow() {
		System.out.println("Hamster bow : baa");
	}
}
