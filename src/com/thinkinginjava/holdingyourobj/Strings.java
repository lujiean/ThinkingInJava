package com.thinkinginjava.holdingyourobj;

import java.util.*;

public class Strings {
	public static List<String> arrayList(int total){
		Random ran = new Random();
		List<String> outListInt = new ArrayList<String>();
		for(int i = 0; i< total; i++) {
			myInt intVal = new myInt(ran.nextInt(100));
			outListInt.add(intVal.toString());
		}
		return outListInt;
	}
}
