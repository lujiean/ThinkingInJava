package com.thinkinginjava.controlexecute;

/*
 * Exercise 6: (2) Modify the two test( ) methods in the previous two programs so that they take two extra arguments, 
 * begin and end, and so that testval is tested to see if it is within the range between (and including) begin and end.
 */
public class Exercise6 {

	public static boolean TestWithin(int testval, int begin, int end) {
		if(begin <= testval && testval <= end)
			return true;
		else
			return false;
	}
	
	public static int[] RangeArray(int begin, int end) {
		int[] intarr = new int[end - begin + 1];
		int startval = begin;
		for(int i=0;i<=end-begin;i++,startval++)
			intarr[i] = startval;
		return intarr;
	}
	
	public static boolean TestWithinArr(int testval, int begin, int end) {
		for(int i : RangeArray(begin, end) )
			if(i == testval)
				return true;
		return false;
	}
}
