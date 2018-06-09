package com.thinkinginjava.innerclasses3;

import com.thinkinginjava.innerclasses.ItfEx6;
import com.thinkinginjava.innerclasses2.Ex6_2;

public class Ex6_3 extends Ex6_2 {

	public ItfEx6 func1() {
		Ex6_2 ex62 = new Ex6_2();
		Ex6_2_Inner ex2in = ex62.new Ex6_2_Inner();
		return ex2in;
	}
}
