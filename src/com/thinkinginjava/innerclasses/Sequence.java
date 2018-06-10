package com.thinkinginjava.innerclasses;

//: innerclasses/Sequence.java
//Holds a sequence of Objects.

/*
 * Exercise 4: (2) Add a method to the class Sequence.SequenceSelector that produces the reference to the outer class Sequence.
 */

/*
 * Exercise 22: (2) Implement reverseSelector( ) in Sequence.java.
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
	 * Exercise 22
	 */
	public Selector reverseSelector() {
		return new reverseSequenceSelector();
	}
	
	public class reverseSequenceSelector implements Selector{
		private int i = items.length - 1;
		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return i < 0;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i >= 0) i--;
		}
		
	}
	
	public Selector reserveSelector() {
		return new reverseSequenceSelector();
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
		
		/*
		 * Exercise 22
		 */
		Sequence reserveSequence = new Sequence(10);
		for(int i = 0; i < 10; i++)
			reserveSequence.add(Integer.toString(i));
		Selector reserveSelector = reserveSequence.reserveSelector();
		while(!reserveSelector.end()) {
			System.out.print(reserveSelector.current() + " ");
			reserveSelector.next();
		}
	}
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~