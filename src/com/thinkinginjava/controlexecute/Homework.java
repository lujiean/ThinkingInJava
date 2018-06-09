package com.thinkinginjava.controlexecute;

/*
 * Controlling Execution
 */

import static com.thinkinginjava.tools.Tools.*;

public class Homework {

	public static void main(String[] args) {
		/*
		 * Exercise 1
		 */
		Println("### Exercise1 ###");
		Exercise1.PrintNumberRange(1, 100);
		
		/*
		 * Exercise 2
		 */
		Println("### Exercise2 ###");
		Exercise2.CompareToSecondaryNumber();
		
		/*
		 * Exercise 3
		 */
		Println("### Exercise3 ###");
//		Exercise2.CompareToSecondaryNumberInfinite();
		
		/*
		 * Exercise 4
		 */
		Println("### Exercise4 ###");
		int num = 4;
		Println(num + " is prime number = " + Exercise4.DetectNestedNumber(num));
		
		/*
		 * Exercise 5
		 */
		Println("### Exercise5 ###");
		int i = 6;
		int j = 10;
		Println(Exercise5.IntToBinary(i));
		Println(Exercise5.IntToBinary(j));
		Println(Exercise5.IntToBinAnd(i, j));
		Println(Exercise5.IntToBinOr(i, j));
		Println(Exercise5.IntToBinXor(i, j));
		Println(Exercise5.IntToBinNot(i));
		
		/*
		 * Exercise 6
		 */
		Println("### Exercise6 ###");
		Println("6 within 3 and 10 is " + Exercise6.TestWithin(6, 3, 10));
		Println("2 within 3 and 10 is " + Exercise6.TestWithin(2, 3, 10));
		Println("10 within 3 and 10 is " + Exercise6.TestWithinArr(10, 3, 10));
		
		/*
		 * Exercise 7
		 */
		Println("### Exercise7 ###");
		Exercise7.PrintNumberRange(1, 100);
		Exercise7.PrintNumberRange2(1, 100);
		
		/*
		 * Exercise 8
		 */
		Println("### Exercise8 ###");
		Exercise8.PrintEachSwitch();
		Exercise8.PrintEachSwitchNoBreak();
		
		/*
		 * Exercise 9
		 */
		Println("### Exercise9 ###");
		Exercise9.PrintFibonacci(10);
		
		/*
		 * Exercise 10
		 */
		Println("### Exercise10 ###");
		Exercise10.VampireNumbers();
	}
}
