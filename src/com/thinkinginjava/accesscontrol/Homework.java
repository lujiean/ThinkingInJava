package com.thinkinginjava.accesscontrol;

import com.thinkinginjava.ashomewk.*;
import com.thinkinginjava.ashomewk_coli.*;
import com.thinkinginjava.tools.Tools;
/*
 * Access Control
 */
public class Homework {

	public static void main(String[] args) {
		/*
		 * Exercise 1
		 */
		
		/*
		 * Exercise 2
		 */
		Tools.PrintExercise(1);
		// be ambious
		//Exercise1 ex1 = new Exercise1();
		com.thinkinginjava.ashomewk.Exercise1 ex1_1= new com.thinkinginjava.ashomewk.Exercise1();
		
		/*
		 * Exercise 4
		 */
		Tools.PrintExercise(4);
		// same package can access protected function
		Exercise4.printEx4Protected();
		Exercise4.printEx4Public();
		Exercise4.printEx4Default();
		
		/*
		 * Exercise 5
		 */
		Tools.PrintExercise(5);
		Exercise5 ex5 = new Exercise5();
		Tools.Println("Can access var : " + ex5.iDefalut + ex5.iProtected + ex5.iPublic);
		ex5.FuncPublic();
		ex5.FuncProtected();
		ex5.FuncDefalut();
		
		/*
		 * Exercise 6
		 */
		Tools.PrintExercise(6);
		Exercise6 ex6 = new Exercise6();
		ex6.maniProtect();
		
		/*
		 * Exercise 7
		 */
		Tools.PrintExercise(7);
		Exercise7 ex7 = new Exercise7();
		Widget wd = new Widget();
		
		/*
		 * Exercise 8
		 */
		Tools.PrintExercise(8);
		// Constructor not visible.
//		ConnectionManager CM1 = new ConnectionManager();
		ConnectionManager CM1 = ConnectionManager.GetCM();
		ConnectionManager CM2 = ConnectionManager.GetCM();
		String[] connect = new String[3];
		connect = CM1.GetCMObj();
		System.out.println("CM OBJ : " + connect);
		connect = CM2.GetCMObj();
		System.out.println("CM OBJ : " + connect);
	}
}
