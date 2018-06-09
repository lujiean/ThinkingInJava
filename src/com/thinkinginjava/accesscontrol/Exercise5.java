package com.thinkinginjava.accesscontrol;

/*
 * Exercise 5: (2) Create a class with public, private, protected, and package-access fields and method members. 
 * Create an object of this class and see what kind of compiler messages you get when you try to access all the class members. 
 * Be aware that classes in the same directory are part of the ¡°default¡± package.
 */
public class Exercise5 {

	public int iPublic = 1;
	private int iPrivate = 2;
	protected int iProtected = 3;
	int iDefalut = 4;
	
	public void FuncPublic() {
		System.out.println("call func Public.");
	}
	
	private void FuncPrivate() {
		System.out.println("call func Private.");
	}
	
	protected void FuncProtected() {
		System.out.println("call func Protected.");
	}
	
	void FuncDefalut() {
		System.out.println("call func Defalut.");
	}
}
