package com.thinkinginjava.polymorphism;

public class Zoo {

	private RodentShared rs;
//	private Mouse mouse = new Mouse(rs);
//	private Gerbil gerbil = new Gerbil(rs);
//	private Hamster hamster = new Hamster(rs);
	
	private Mouse mouse;
	private Gerbil gerbil;
	private Hamster hamster;
	
	public Zoo(RodentShared rs) {
		this.rs = rs;
		mouse = new Mouse(rs);
		gerbil = new Gerbil(rs);
		hamster = new Hamster(rs);
	}
}
