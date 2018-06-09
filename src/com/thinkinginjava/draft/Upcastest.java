package com.thinkinginjava.draft;

class Base{
	private void p1() {
		System.out.println("call private p1");
	}
	
	void p2(Base base) {
		System.out.println("call p2");
//		p1();
	}
	
	void p3(Upcastest upc) {
		System.out.println("call p3");
	}
}
public class Upcastest extends Base{

	public static void main(String[] args) {
		Upcastest up = new Upcastest();
		up.p2(up);
//		up.p1();
		Base base = new Base();
		base.p3(up);
//		base.p3(base);
	}
}
