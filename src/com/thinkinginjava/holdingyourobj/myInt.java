package com.thinkinginjava.holdingyourobj;

public class myInt implements Comparable<myInt>{
	private Integer iVal;
	private static int id = 0;
	public myInt(int i) {
		// TODO Auto-generated constructor stub
		iVal = new Integer(i);
		id++;		
	}
	
	public int id() {
		return id;
	}

	@Override
	public int compareTo(myInt o) {
		// TODO Auto-generated method stub
		return this.iVal.intValue() - o.iVal.intValue();
	}
	
	public String toString() {
		return iVal.toString();
	}
}
