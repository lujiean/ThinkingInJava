package com.thinkinginjava.innerclasses;

import com.thinkinginjava.innerclasses.Ex7.Ex7_In;

public class Ex12 {

	private int i = 4;
	
//	private void func1() {
//		System.out.println("Ex7.func1() - " + i);
//	}
//	
//	class Ex7_In {
//		public void func2() {
//			i = 8;
//			func1();
//		}
//	}
	
	public ItfEx6 func2() {
		// ItfEx6 is an interface
		return new ItfEx6() {
			public void func1() {
				System.out.println("Ex12.ItfEx6.func1() + " + i);
			}
		};
	}
	public static void main(String[] args) {

		Ex12 ex12 = new Ex12();
		ItfEx6 itfex12 = ex12.func2();
		itfex12.func1();
	}
}
