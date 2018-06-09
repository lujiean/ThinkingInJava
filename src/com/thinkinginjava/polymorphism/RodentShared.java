package com.thinkinginjava.polymorphism;

public class RodentShared {

	private static int count = 0;
	public void add() {
		count = count +1;
	}
	
	public static int getRodentCnt() {
		return count;
	}
}
