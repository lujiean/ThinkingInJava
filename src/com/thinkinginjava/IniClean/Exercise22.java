package com.thinkinginjava.IniClean;

public class Exercise22 {

	private Currency ccy;
	
	public Exercise22(Currency ccy) {
		// TODO Auto-generated constructor stub
		this.ccy = ccy;
	}
	
	public void DisplayStatement() {
		switch (ccy) {
		case RMB:
			System.out.println("this is an " + ccy + " prod");
			break;
		case HKD:
			System.out.println( ccy + " prod");
			break;
		default:
			System.out.println(" not reconnize");
			break;
		}
	}
}
