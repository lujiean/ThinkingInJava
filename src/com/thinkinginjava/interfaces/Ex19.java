package com.thinkinginjava.interfaces;

import java.util.Random;

/*
 * Exercise 19: (3) Create a framework using Factory Methods that performs both coin tossing and dice tossing.
 */

interface Tossing{
	int toss();
}

interface TossingFactory{
	String getName();
	Tossing getTossing();
}

class coin implements Tossing{

	@Override
	public int toss() {
		// TODO Auto-generated method stub
		Random ran = new Random();
		return ran.nextInt(2);
	}
	
}

class dice implements Tossing{

	@Override
	public int toss() {
		// TODO Auto-generated method stub
		Random ran = new Random();
		return ran.nextInt(6);
	}
	
}

class coinFactory implements TossingFactory{

	@Override
	public Tossing getTossing() {
		// TODO Auto-generated method stub
		return new coin();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "coinFactory";
	}
	
}

class diceFactory implements TossingFactory{

	@Override
	public Tossing getTossing() {
		// TODO Auto-generated method stub
		return new dice();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "diceFactory";
	}
	
}


public class Ex19 {

	public static String Play(TossingFactory tf) {
		return "Play "+ tf.getName() + " "+ tf.getTossing().toss();
	}
	
	public static void main(String[] args) {
		System.out.println(Play(new coinFactory()));
		System.out.println(Play(new diceFactory()));
	}
}
