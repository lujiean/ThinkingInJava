package com.thinkinginjava.reusingclasses;

/*
 * Exercise 3: (2) Prove the previous sentence.
 * (Even if you don¡¯t create a constructor for Cartoon( ), the compiler will synthesize a default constructor for you that calls the base class constructor.)
 * 
 * Exercise 4: (2) Prove that the base-class constructors are (a) always called and (b) called before derived-class constructors.
 */
import com.thinkinginjava.tools.*;
class Art {
	Art() { Tools.Println("Art constructor"); }
}
class Drawing extends Art {
	Drawing() { Tools.Println("Drawing constructor"); }
}

public class Cartoon extends Drawing{

//	public Cartoon() { Tools.Println("Cartoon constructor"); }
	public static void main(String[] args) {
	Cartoon x = new Cartoon();
	}
}
