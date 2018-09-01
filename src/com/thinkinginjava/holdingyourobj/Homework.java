package com.thinkinginjava.holdingyourobj;

/*
 * Holding Your Objects
 */
import static com.thinkinginjava.tools.Tools.*;

import java.util.*;
public class Homework {

	public static void main(String[] args) {
		/*
		 * Exercise 1: (2) Create a new class called Gerbil with an int gerbilNumber that¡¯s initialized in the constructor. 
		 * Give it a method called hop( ) that displays which gerbil number this is, and that it¡¯s hopping. 
		 * Create an ArrayList and add Gerbil objects to the List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
		 */
		PrintExercise(1);
		ArrayList<Gerbil> listOfGerbil = new ArrayList<Gerbil>();
		listOfGerbil.add(new Gerbil(9));
		listOfGerbil.add(new Gerbil(78));
		for(Gerbil e : listOfGerbil)
			e.hop();
		for(int i = 0; i<listOfGerbil.size(); i++)
			listOfGerbil.get(i).hop();
		
		/*
		 * Exercise 2: (1) Modify SimpleCollection.java to use a Set for c.
		 */
		PrintExercise(2);
		SimpleCollection.main(null);
		
		/*
		 * Exercise 3: (2) Modify innerclasses/Sequence.java so that you can add any number of elements to it.
		 */
		PrintExercise(3);
		
		/*
		 * Exercise 4: (3) Create a generator class that produces character names (as String objects) from your favorite movie 
		 * (you can use Snow White or Star Wars as a fallback) each time you call next( ), 
		 * and loops around to the beginning of the character list when it runs out of names. 
		 * Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet, then print each container.
		 */
		PrintExercise(4);
		Generator.main(null);
		
		/*
		 * Exercise 5: (3) Modify ListFeatures.java so that it uses Integers (remember autoboxing!) instead of Pets, and explain any difference in results.
		 */
		PrintExercise(5);
		ListFeatures.main(null);
		
		/*
		 * Exercise 6: (2) Modify ListFeatures.java so that it uses Strings instead of Pets, and explain any difference in results.
		 */
		PrintExercise(6);
		ListFeatures2.main(null);
		
		/*
		 * Exercise 7: (3) Create a class, then make an initialized array of objects of your class. 
		 * Fill a List from your array. Create a subset of your List by using subList( ), then remove this subset from your List.
		 */
		PrintExercise(7);
		Ex7[] ex7Arr = new Ex7[3];
		ex7Arr[0] = new Ex7(8);
		ex7Arr[1] = new Ex7(79);
		ex7Arr[2] = new Ex7(211);
		List<Ex7> lstEx7 = Arrays.asList(ex7Arr[0], ex7Arr[1], ex7Arr[2]);
		print(lstEx7.toString());
		
		List<Ex7> lstEx7Sub = lstEx7.subList(0, 2);
		print(lstEx7Sub.toString());
		List<Ex7> copy = new ArrayList<Ex7>(lstEx7);
		copy.removeAll(lstEx7Sub);
		print(copy.toString());
		print(lstEx7.toString()); 
		
//		List<Ex7> copy = new ArrayList<Ex7>(lstEx7);
//		List<Ex7> lstEx7Sub = copy.subList(0, 2);
//		print(lstEx7Sub.toString());
//		lstEx7.removeAll(lstEx7Sub);
//		print(lstEx7.toString());
		
		/*
		 * Exercise 8: (1) Modify Exercise l so it uses an Iterator to move through the List while calling hop( ).
		 */
		PrintExercise(8);
		ArrayList<Gerbil> listOfGerbil2 = new ArrayList<Gerbil>();
		listOfGerbil2.add(new Gerbil(9));
		listOfGerbil2.add(new Gerbil(78));
		
		Iterator<Gerbil> it = listOfGerbil2.iterator();
		while(it.hasNext()) {
			Gerbil gerbil = it.next();
			gerbil.hop();
		}
//		for(Gerbil e : listOfGerbil)
//			e.hop();
//		for(int i = 0; i<listOfGerbil.size(); i++)
//			listOfGerbil.get(i).hop();
		
		/*
		 * Exercise 9: (4) Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.
		 */
		PrintExercise(9);
		Sequence.main(null);
		
		/*
		 * Exercise 10: (2) Change Exercise 9 in the Polymorphism chapter to use an ArrayList to hold 
		 * the Rodents and an Iterator to move through the sequence of Rodents.
		 */
		PrintExercise(10);
		
	}
}
