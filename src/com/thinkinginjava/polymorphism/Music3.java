package com.thinkinginjava.polymorphism;

import java.util.Random;

import com.thinkinginjava.tools.*;

interface Playable{
	void play(Note n);
}
abstract class AbsInstrument{
	abstract void adjust();
//	abstract void play(Note n);
}
/*
class Instrument {
	void play(Note n) { Tools.Println("Instrument.play() " + n); }
//	String what() { return "Instrument"; }
	public String toString() { return "Instrument"; }
	void adjust() { Tools.Println("Adjusting Instrument"); }
}
*/

//class Wind extends Instrument {
//class Wind extends AbsInstrument{
class Wind extends AbsInstrument implements Playable{
	public void play(Note n) { Tools.Println("Wind.play() " + n); }
	
//	String what() { return "Wind"; }
	public String toString() { return "Wind"; }
	
	void adjust() { Tools.Println("Adjusting Wind"); }
}

//class Percussion extends Instrument {
//class Percussion extends AbsInstrument {
class Percussion extends AbsInstrument implements Playable{
	public void play(Note n) { Tools.Println("Percussion.play() " + n); }
	
//	String what() { return "Percussion"; }
	public String toString() { return "Percussion"; }
	
	void adjust() { Tools.Println("Adjusting Percussion"); }
}

//class Stringed extends Instrument {
//class Stringed extends AbsInstrument {
class Stringed extends AbsInstrument implements Playable{
	
//	void play(Note n) { Tools.Println("Stringed.play() " + n); }
	public void play(Note n) { Tools.Println("Stringed.play() " + n); }
	
//	String what() { return "Stringed"; }
	public String toString() { return "Stringed"; }
	
	void adjust() { Tools.Println("Adjusting Stringed"); }
	}

//class Brass extends Wind {
class Brass extends Wind{
//	void play(Note n) { Tools.Println("Brass.play() " + n); }
	public void play(Note n) { Tools.Println("Brass.play() " + n); }
	
	void adjust() { Tools.Println("Adjusting Brass"); }
}

class Woodwind extends Wind{
//	void play(Note n) { Tools.Println("Woodwind.play() " + n); }
	public void play(Note n) { Tools.Println("Woodwind.play() " + n); }
//	String what() { return "Woodwind"; }
	public String toString() { return "Woodwind"; }
}

//class Guitar extends Instrument{
class Guitar extends AbsInstrument implements Playable{
//	void play(Note n) { Tools.Println("Guitar.play() " + n); }
	public void play(Note n) { Tools.Println("Guitar.play() " + n); }
	public String toString() { return "Guitar"; }
	
	void adjust() { Tools.Println("Adjusting Guitar"); }
}

class RandomInstrument {
	private Random rand = new Random(47);
	
//	public Instrument next() {
	public AbsInstrument next() {
		switch(rand.nextInt(6)) {
			default :
			case 0 : return new Wind();
			case 1 : return new Percussion();
			case 2 : return new Stringed();
			case 3 : return new Brass();
			case 4 : return new Woodwind();
			case 5 : return new Guitar();
		}
	}
}
public class Music3 {
	// Doesn¡¯t care about type, so new types
	// added to the system still work right:
//	public static void tune(Instrument i) {
//	public static void tune(AbsInstrument i) {
	public static void tune(Playable i) {
	// ...
	i.play(Note.MIDDLE_C);
	}
//	public static void tuneAll(Instrument[] e) {
//	public static void tuneAll(AbsInstrument[] e) {
	public static void tuneAll(Playable[] e) {
//		for(AbsInstrument i : e)
		for(Playable i : e)
			tune(i);
	}
	
	private static RandomInstrument gen = new RandomInstrument();
	
	public static void main(String[] args) {
		// Upcasting during addition to the array:
//		Instrument[] orchestra = {
//		AbsInstrument[] orchestra = {
		Playable[] orchestra = {
				new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind(),
			new Guitar()
			};
		tuneAll(orchestra);
		
		/*
		 * Exercise 6: (1) Change Music3.java so that what( ) becomes the root Object method toString( ). 
		 * Try printing the Instrument objects using System.out.println( ) (without any casting).
		 */
		
		/*
		 * Exercise 7: (2) Add a new type of Instrument to Music3.java and verify that polymorphism works for your new type.
		 */
		Tools.PrintExercise(6);
		Tools.PrintExercise(7);
//		for(Instrument ins : orchestra)
//		for(AbsInstrument ins : orchestra)
		for(Playable ins : orchestra)
			System.out.println(ins);

		/*
		 * Exercise 8: (2) Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.
		 */
		
		/*
		Tools.PrintExercise(8);
//		Instrument[] instruments = new Instrument[9];
		Absinstruments[] instruments = new Absinstruments[9];
		
		for(int i = 0; i<9; i++) {
//			instruments[i] = gen.next();
			Absinstruments[i] = gen.next();
		}
		for(Instrument ins : instruments)
			System.out.println(ins);
		*/
	}
}