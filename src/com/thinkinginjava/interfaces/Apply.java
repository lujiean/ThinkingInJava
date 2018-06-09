package com.thinkinginjava.interfaces;

import static com.thinkinginjava.tools.Tools.*;
import java.util.Arrays;

interface Processor {
//	public String name() {
//		return getClass().getSimpleName();
//	}
	public String name() ;
//	Object process(Object input) { return input; }
	Object process(Object input);
}

class Upcase implements Processor {
	public String name() {
		return "Upcase";
	}
	public String process(Object input) { // Covariant return
		return ((String)input).toUpperCase();
	}
}

class Downcase implements Processor {
	public String name() {
		return "Downcase";
	}
	public String process(Object input) {
		return ((String)input).toLowerCase();
	}
}

class Splitter implements Processor {
	public String name() {
		return "Splitter";
	}
	public String process(Object input) {
		// The split() argument divides a String into pieces:
		return Arrays.toString(((String)input).split(" "));
	}
}

class Ex11 implements Processor {
	public String name() {
		return "Ex11";
	}
	
	public String process(Object input) {
		// swaps each pair of characters in that argument
		// abc=> bac
		String s = (String) input;
		String s0 = "";
		
		for(int i=0;i <= s.length() - 1; i=i+2 )
			if (i+1 > s.length() - 1)
				s0 = s0 + s.substring(i, i+1);
			else
				s0 = s0 + s.substring(i+1, i+2) + s.substring(i, i+1);
		return s0;
	}
}

public class Apply {
	public static void process(Processor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s) + "");
	}
	public static String s =
			"Disagreement with beliefs is by definition incorrect";
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
		process(new Ex11(), s);
	}
} 
