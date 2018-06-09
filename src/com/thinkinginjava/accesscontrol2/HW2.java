package com.thinkinginjava.accesscontrol2;

import com.thinkinginjava.accesscontrol.*;
import com.thinkinginjava.tools.*;
public class HW2 {

	public static void main(String[] args) {
		/*
		 * Exercise 4
		 */
		Tools.PrintExercise(4);
		Exercise4.printEx4Public();
		// not visible the protected function
//		Exercise4.printEx4Prote();
		// not visible defalut
		
		/*
		 * Exercise 5
		 */
		Tools.PrintExercise(5);
		// if class is default visible, then 
		Exercise5 ex5 = new Exercise5();
		// only public is visible
//		Tools.Println("Can access var : " + ex5.iDefalut + ex5.iProtected + ex5.iPublic);
		Tools.Println("Can access var : " + ex5.iPublic);
		ex5.FuncPublic();
		
		/*
		 * Exercise 7
		 */
		Tools.PrintExercise(7);
		Exercise7 ex7 = new Exercise7();
		// get not get the Widget for package access.
//		Widget wd = new Widget();
	}

}
