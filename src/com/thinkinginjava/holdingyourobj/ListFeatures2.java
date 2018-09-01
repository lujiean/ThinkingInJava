package com.thinkinginjava.holdingyourobj;

/*
 * Exercise 6: (2) Modify ListFeatures.java so that it uses String instead of Pets, and explain any difference in results.
 */
import java.util.*;
import static com.thinkinginjava.tools.Tools.*;

public class ListFeatures2 {

	public static void main(String[] args) {
		Random rand = new Random(47);
//		List<Pet> pets = Pets.arrayList(7);
		List<String> pets = Strings.arrayList(7);	//Ex6
		print("1: " + pets);
//		Hamster h = new Hamster();
		String h = new String("233");	//Ex6
		pets.add(h); // Automatically resizes
		print("2: " + pets);
		print("3: " + pets.contains(h));
		pets.remove(h); // Remove by object
//		Pet p = pets.get(2);
		String p = pets.get(2);	//Ex6
		print("4: " + p + " " + pets.indexOf(p));
//		Pet cymric = new Cymric();
		String cymric = new String("344");	//Ex6
		print("5: " + pets.indexOf(cymric));
		print("6: " + pets.remove(cymric));
		// Must be the exact object:
		print("7: " + pets.remove(p));
		print("8: " + pets);
//		pets.add(3, new Mouse()); // Insert at an index
		pets.add(3, new String("455")); // Insert at an index	//Ex6
		print("9: " + pets);
//		List<Pet> sub = pets.subList(1, 4);
		List<String> sub = pets.subList(1, 4);	//Ex6
		print("subList: " + sub);
		print("10: " + pets.containsAll(sub));
		Collections.sort(sub); // In-place sort
		print("sorted subList: " + sub);
		// Order is not important in containsAll():
		print("11: " + pets.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		print("shuffled subList: " + sub);
		print("12: " + pets.containsAll(sub));
//		List<Pet> copy = new ArrayList<Pet>(pets);
		List<String> copy = new ArrayList<String>(pets);	//Ex6
		sub = Arrays.asList(pets.get(1), pets.get(4));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
//		copy = new ArrayList<Pet>(pets); // Get a fresh copy
		copy = new ArrayList<String>(pets); // Get a fresh copy	//Ex6
		copy.remove(2); // Remove by index
		print("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		print("15: " + copy);
//		copy.set(1, new Mouse()); // Replace an element
		copy.set(1, new String("566")); // Replace an element	//Ex6
		print("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		print("17: " + copy);
		print("18: " + pets.isEmpty());
		pets.clear(); // Remove all elements
		print("19: " + pets);
		print("20: " + pets.isEmpty());
//		pets.addAll(Pets.arrayList(4));
		pets.addAll(Strings.arrayList(4));	//Ex6
		print("21: " + pets);
		Object[] o = pets.toArray();
		print("22: " + o[3]);
//		Pet[] pa = pets.toArray(new Pet[0]);
		String[] pa = pets.toArray(new String[0]);	//Ex6
//		print("23: " + pa[3].id());
	}
}
