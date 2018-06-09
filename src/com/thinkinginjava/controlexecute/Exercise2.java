package com.thinkinginjava.controlexecute;

import java.util.Random;
import static com.thinkinginjava.tools.Tools.*;

/*
 * Exercise 2: (2) Write a program that generates 25 random int values. 
 * For each value, use an if-else statement to classify it as greater than, less than, or equal to a second randomly generated value.
 * 
 * Exercise 3: (1) Modify Exercise 2 so that your code is surrounded by an ¡°infinite¡± while loop. 
 * It will then run until you interrupt it from the keyboard (typically by pressing Control-C).
 */
public class Exercise2 {

	public static void CompareToSecondaryNumber() {
		int curNum;
		int preNum =0;
		Random ran = new Random();
		for(int i=1;i<=25;i++) {
			curNum = ran.nextInt();
			Println("curNum : preNum = " + curNum + " : " + preNum);
			if(curNum < preNum)
				Println("curNum < preNum");
			else if(curNum > preNum)
				Println("curNum > preNum");
			else
				Println("curNum = preNum");
				
			preNum = curNum;
		}
	}
	
	public static void CompareToSecondaryNumberInfinite() {
		int curNum;
		int preNum =0;
		Random ran = new Random();
//		for(int i=1;i<=25;i++) {
		for(;;) {
			curNum = ran.nextInt();
			Println("curNum : preNum = " + curNum + " : " + preNum);
			if(curNum < preNum)
				Println("curNum < preNum");
			else if(curNum > preNum)
				Println("curNum > preNum");
			else
				Println("curNum = preNum");
				
			preNum = curNum;
		}
	}
}
