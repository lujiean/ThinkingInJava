package com.thinkinginjava.operators;

import java.util.Random;

public class Coin {

	public static boolean flip() {
		
		Random rand = new Random();
		int i = rand.nextInt(100);
		
		// true means is front and false is back
		if(i % 2 == 1)
			return true;
		else
			return false;
	}
}
