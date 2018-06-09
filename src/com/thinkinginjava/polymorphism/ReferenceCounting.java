package com.thinkinginjava.polymorphism;

/*
 * Exercise 13: (3) Add a finalize( ) method to ReferenceCounting.
 * java to verify the termination condition (see the Initialization & Cleanup chapter).
 */
import static com.thinkinginjava.tools.Tools.*;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	
	public Shared() {
		print("Creating " + this);
	}
	
	public void addRef() { refcount++; }
	
	protected void dispose() {
		if(--refcount == 0)
			print("Disposing " + this);
	}
	
	public String toString() { return "Shared " + id; }
	
	protected void finalize() {
		print("Shared finalize()");
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	
	public Composing(Shared shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose() {
		print("disposing " + this);
		shared.dispose();
	}
	public String toString() { return "Composing " + id; }
	
	protected void finalize() {
		print("Composing finalize()");
	}
}

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		
		for(Composing c : composing)
			c.dispose();
		
		for(Composing c : composing)
			c = null;
		System.gc();
	}
}

