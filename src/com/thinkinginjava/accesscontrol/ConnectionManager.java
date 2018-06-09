package com.thinkinginjava.accesscontrol;

/*
 * Exercise 8: (4) Following the form of the example Lunch.java, create a class called ConnectionManager that manages a fixed array of Connection objects. 
 * The client programmer must not be able to explicitly create Connection objects, but can only get them via a static method in ConnectionManager. 
 * When the ConnectionManager runs out of objects, it returns a null reference. 
 * Test the classes in main( ).
 */
public class ConnectionManager {

	private static int count = 0;
	private static String[] conectObjs = new String[3];
	private static ConnectionManager CM = new ConnectionManager();
	
	private ConnectionManager() {
		conectObjs[0] = "jiean.lu";
		conectObjs[1] = "passwd";
		conectObjs[2] = "192.168.1.address";
		count++;
	}
	
	public static ConnectionManager GetCM() {
		System.out.println("CM count: " + count);
		return CM;
	}
	
	public static String[] GetCMObj() {
		return conectObjs;
	}
}
