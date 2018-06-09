package com.thinkinginjava.controlexecute;

/*
 * Exercise 5: (4) Repeat Exercise 10 from the previous chapter, 
 * using the ternary operator and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
 */
public class Exercise5 {

	public static String IntToBinary(int i) {
		String str = "";
		int processNum = i;
		while(processNum != 0) {
			str = processNum % 2 + str;
			processNum = processNum / 2;
		}
		return str;
	}
	
	public static String IntToBinAnd(int i, int j) {
		String a = IntToBinary(i);
		String b = IntToBinary(j);
		char ch;
		String str = "";
		
		// get the max length( compare from bottom)
		int length = a.length() > b.length() ? a.length() : b.length();
		
		// leading Zero
		while(a.length() < length)
			a = '0' + a;
		while(b.length() < length)
			b = '0' + b;
		
		// compare
		for(i=0;i<=length-1;i++) {
			ch = (a.charAt(i) == '1' && b.charAt(i) == '1') ? '1' : '0';
			str = str + ch;
		}
		return str;
	}
	
	public static String IntToBinOr(int i, int j) {
		String a = IntToBinary(i);
		String b = IntToBinary(j);
		char ch;
		String str = "";
		
		// get the max length( compare from bottom)
		int length = a.length() > b.length() ? a.length() : b.length();
		
		// leading Zero
		while(a.length() < length)
			a = '0' + a;
		while(b.length() < length)
			b = '0' + b;
		
		// compare
		for(i=0;i<=length-1;i++) {
			ch = (a.charAt(i) == '1' || b.charAt(i) == '1') ? '1' : '0';
			str = str + ch;
		}
		return str;
	}
	
	public static String IntToBinXor(int i, int j) {
		String a = IntToBinary(i);
		String b = IntToBinary(j);
		char ch;
		String str = "";
		
		// get the max length( compare from bottom)
		int length = a.length() > b.length() ? a.length() : b.length();
		
		// leading Zero
		while(a.length() < length)
			a = '0' + a;
		while(b.length() < length)
			b = '0' + b;
		
		// compare
		for(i=0;i<=length-1;i++) {
			ch = (a.charAt(i) != b.charAt(i)) ? '1' : '0';
			str = str + ch;
		}
		return str;
	}
	
	public static String IntToBinNot(int i) {
		String a = IntToBinary(i);
		char ch;
		String str = "";
		
		int length = a.length();
		
		// compare
		for(i=0;i<=length-1;i++) {
			ch = (a.charAt(i) == '1') ? '0' : '1';
			str = str + ch;
		}
		return str;
	}
}
