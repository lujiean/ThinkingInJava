package com.thinkinginjava.draft;

import java.util.Date;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Test {

	public static void main(String[] args) {
		// test s is only a ref not point to an object
		String s;
		//System.out.println(s.length());
		
		
		/*
		test {} 
		// code inside the {} can change outside {}
		*/
		int x = 0;
		{
			int y = 2;
			System.out.println("y = " + y);
			x = 1;
		}
		System.out.println("x = " + x);
		//System.out.println(y);
		
		/*
		 *  test {} for object
		 */
		String s1 = new String("James");
		{
			String s2 = new String("what?");
			System.out.println(s2);
			s1 = "bb";
			
		}
		System.out.println(s1);
		//System.out.println(s2);
		
		/*
		 * test class
		 */
		TestClass tc1 = new TestClass();
		//for the ref type must have new
		System.out.println("tc1.a = " + tc1.a);
//		System.out.println("tc1.str.length() = " + tc1.str.length());
		System.out.println("tc1.strb.length() = " + tc1.strb.length());
		
		/*
		 * test static func fcall
		 * only warning call static with obj
		 * 
		 * ref tc2 can not call static
		 */
		System.out.println(TestClass.cnt);
		
		tc1.SaticFuncTest();
		System.out.println(tc1.cnt);
		TestClass.SaticFuncTest();
		System.out.println(TestClass.cnt);
		TestClass tc2;
		
//		tc2.SaticFuncTest();
		
		System.out.println(new Date());
		
		/*
		 * try use println directly
		 */
		out.println("hello");
		
		getProperties().list(out);
		System.out.println(getProperty("user.home"));
		
		System.out.println("unary - long is " + +-12l);
		
		System.out.println("Math.round " + Math.round(8.4f));
		
		byte b = 4;
		
		out.println("-------------");
		new Cupboard();
		
	}
}
