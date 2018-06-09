package com.thinkinginjava.innerclasses;

//: innerclasses/Sequence.java
//Holds a sequence of Objects.

/*
 * Exercise 4: (2) Add a method to the class Sequence.SequenceSelector that produces the reference to the outer class Sequence.
 */

interface Selector {
	boolean end();
	Object current();
	void next();
}
public class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) { items = new Object[size]; }
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	public class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() { return i == items.length; }
		public Object current() { return items[i]; }
		public void next() { if(i < items.length) i++; }
		/*
		 * Exercise4
		 */
		public Sequence outer() {
			return Sequence.this;
		}
	}
	public Selector selector() {
		return new SequenceSelector();
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
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~