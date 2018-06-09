package com.thinkinginjava.reusingclasses;

/*
 * Exercise 6: (1) Using Chess.java, prove the statements in the previous paragraph.
 */
import com.thinkinginjava.tools.*;
class Game {
	Game(int i) {
		Tools.Println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		Tools.Println("BoardGame constructor");
	}
}

public class Chess extends BoardGame{

	Chess() {
		super(11);
		Tools.Println("Chess constructor");
	}
//	public static void main(String[] args) {
//		Chess x = new Chess();
//	}
}
