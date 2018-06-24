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
	}
}
