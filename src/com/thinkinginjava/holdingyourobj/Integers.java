package com.thinkinginjava.holdingyourobj;

import java.util.*;

public class Integers {

	public static List<myInt> arrayList(int total){
		Random ran = new Random();
		List<myInt> outListInt = new ArrayList<myInt>();
		for(int i = 0; i< total; i++) {
			myInt intVal = new myInt(ran.nextInt(100));
			outListInt.add(intVal);
		}
		return outListInt;
	}
}
