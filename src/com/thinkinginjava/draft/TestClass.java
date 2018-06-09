package com.thinkinginjava.draft;

public class TestClass {

	//premitive type
	public int a = 1;
	// ref tyep
	public String str;
	public String strb = new String("myStrb");
	//public TestClass tcin;
	public static int cnt =3;
	
	public static void SaticFuncTest() {
		System.out.println("call SaticFuncTest");
		cnt++;
	}
}
