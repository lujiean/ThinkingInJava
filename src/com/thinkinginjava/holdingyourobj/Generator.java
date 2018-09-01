package com.thinkinginjava.holdingyourobj;

import java.util.*;

/*
 * Exercise 4: (3) Create a generator class that produces character names (as String objects) from your favorite movie 
 * (you can use Snow White or Star Wars as a fallback)
 * each time you call next( ), and loops around to the beginning of the character list when it runs out of names. 
 * Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet, then print each container.
 */
public class Generator {

	private String[] movie = new String[2];
	private int currentIndex = 0;
	
	public Generator() {
		// TODO Auto-generated constructor stub
		movie[0]="Snow White";
		movie[1]="Star Wars";
	}
	public String next() {
		String s;
		if (currentIndex == 2)
			currentIndex = 0;
		if (currentIndex < 2) {
			s=movie[currentIndex];
			currentIndex++;
			return s;
		}
		else
			return null;
	}
	
	public static void main(String[] args) {
		Generator gen = new Generator();
		ArrayList<String> al = new ArrayList<String>();
		for(int i = 0;i<2;i++) {
			al.add(gen.next());
		}
		System.out.println(Arrays.toString(al.toArray()));
		
		LinkedList<String> ll = new LinkedList<String>();
		for(int i = 0;i<2;i++) {
			ll.add(gen.next());
		}
		System.out.println(Arrays.toString(ll.toArray()));
		
//		HashSet
		HashSet<String> hs = new HashSet<String>();
		for(int i = 0;i<2;i++) {
			hs.add(gen.next());
		}
		System.out.println(Arrays.toString(hs.toArray()));
		
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		for(int i = 0;i<2;i++) {
			lh.add(gen.next());
		}
		System.out.println(Arrays.toString(lh.toArray()));
		
//		TreeSet
		TreeSet<String> ts = new TreeSet<String>();
		for(int i = 0;i<2;i++) {
			ts.add(gen.next());
		}
		System.out.println(Arrays.toString(ts.toArray()));
		
	}
}
