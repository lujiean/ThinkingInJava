package com.thinkinginjava.reusingclasses_out;

import com.thinkinginjava.reusingclasses.*;
import com.thinkinginjava.tools.*;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Exercise 15
		 */
		Tools.PrintExercise(15);
		Exercise15 ex15 = new Exercise15();
//		not visible
//		ex15.PrintProtect();
		Exercise15sub ex15sub = new Exercise15sub();
		ex15sub.Print15();
	}
}
