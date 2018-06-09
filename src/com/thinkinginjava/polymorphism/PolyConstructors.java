package com.thinkinginjava.polymorphism;

/*
 * Exercise 15: (2) Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem described in this section.
 */

import static com.thinkinginjava.tools.Tools.*;
class Glyph {
	void draw() { print("Glyph.draw()"); }
	Glyph() {
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glyph{
	private int dot = 10;
	RectangularGlyph(int i){
		dot = i;
		print("RectangularGlyph.RectangularGlyph(), dot = " + dot);
	}
	
	void draw() {
		print("RectangularGlyph.draw(), dot = " + dot);
	}
}
public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
		print("######");
		new RectangularGlyph(100);
	}
}
