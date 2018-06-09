package com.thinkinginjava.polymorphism;

//public class Mouse extends Rodent{
public class Mouse implements Rodent{

	private RodentShared rs;
	public Mouse(RodentShared rs) {
		// TODO Auto-generated constructor stub
//		super(rs);
		System.out.println("Mouse()");
		this.rs = rs;
	}
	public void bow() {
		System.out.println("Mouse bow : JIJI");
	}
}
