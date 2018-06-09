package com.thinkinginjava.controlexecute;

/*
 * Exercise 7: (1) Modify Exercise 1 so that the program exits by using the break keyword at value 99. Try using return instead.
 */
public class Exercise7 {

	public static void PrintNumberRange(int from, int to) {
		for(int i = from;i <= to;i++){
			if(i == 99)
				break;
			System.out.println(i);
		}
	}
	
	public static void PrintNumberRange2(int from, int to) {
		for(int i = from;i <= to;i++){
			if(i == 99)
				return;
			System.out.println(i);
		}
	}
}
