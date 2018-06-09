package com.thinkinginjava.reusingclasses;

/*
 * Exercise 20: (1) Show that @Override annotation solves the problem in this section.
 */

import static com.thinkinginjava.tools.Tools.*;
class WithFinals {
	// Identical to "private" alone:
	private final void f() { Println("WithFinals.f()"); }
	// Also automatically "final":
	private void g() { Println("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
	// add @Override can check whether the derived class whether is actually overide
//	@Override
	private final void f() {
		Println("OverridingPrivate.f()");
	}
	
//	@Override
	private void g() {
		Println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
//	@Override
	public final void f() {
		Println("OverridingPrivate2.f()");
	}
//	@Override
	public void g() {
		Println("OverridingPrivate2.g()");
	}
}

public class FinalOverridingIllusion {

	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		// You can upcast:
		OverridingPrivate op = op2;
		// But you can¡¯t call the methods:
//		op.f();
//		op.g();
		// Same here:
		WithFinals wf = op2;
		//! wf.f();
		//! wf.g();
		}
}
