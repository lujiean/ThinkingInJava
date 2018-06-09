package com.thinkinginjava.controlexecute;

import static com.thinkinginjava.tools.Tools.*;
/*
 * Exercise 8: (2) Create a switch statement that prints a message for each case, and put the switch inside a for loop that tries each case. 
 * Put a break after each case and test it, then remove the breaks and see what happens.
 */
public class Exercise8 {

	public static void PrintEachSwitch() {
		for(int i = 0;i<=2;i++) {
			switch(i) {
				case 0:
					Println("0 is " + i);
					break;
				case 1:
					Println("1 is " + i);
					break;
				case 2:
					Println("2 is " + i);
					break;
				default:
					Println("other num " + i);
			}
		}
	}
	
	public static void PrintEachSwitchNoBreak() {
		for(int i = 0;i<=2;i++) {
			switch(i) {
				case 0:
					Println("0 is " + i);
				case 1:
					Println("1 is " + i);
				case 2:
					Println("2 is " + i);
				default:
					Println("other num " + i);
			}
		}
	}
}
