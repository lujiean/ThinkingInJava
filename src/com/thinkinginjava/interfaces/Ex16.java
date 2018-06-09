package com.thinkinginjava.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;

/*
 * Exercise 16: (3) Create a class that produces a sequence of chars. Adapt this class so that it can be an input to a Scanner object.
 */

public class Ex16 implements Readable{

	private String p_s;
	public Ex16(String s) {
		// TODO Auto-generated constructor stub
		p_s = s;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		cb.append(p_s);
//		return 0;
		return -1;
	}

}
