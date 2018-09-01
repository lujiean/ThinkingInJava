package com.thinkinginjava.holdingyourobj;

import java.util.Iterator;

//: innerclasses/Sequence.java
//Holds a sequence of Objects.

/*
 * Exercise 9: (4) Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.
 */

public class Sequence implements Iterator<Object>{
	private Object[] items;
	private int next = 0;
//	private Object curItem;
//	private int curInt;
	
	public Sequence(int size) { items = new Object[size]; }
	public void add(Object x) {
		if(next < items.length) {
			items[next++] = x;
		}
	}

	/*
	 * Exercise4
	 */
	public void pEx4() {
		System.out.println("call pEx4()");
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
//		Selector selector = sequence.selector();
//		while(!selector.end()) {
//			System.out.print(selector.current() + " ");
//			selector.next();
//		}
		while(sequence.hasNext())
		{
			Object obj = sequence.next();
			System.out.print(obj + " ");
		}
		System.out.println("");
		
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (next - 1 >= 0) 
			return true;
		else
			return false;
	}
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		next = next - 1;
		return items[next];
//		return null;
	}
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~