package com.thinkinginjava.interfaces;

/*
 * Exercise 13: (2) Create an interface, and inherit two new interfaces from that interface. 
 * Multiply inherit a third interface from the second two.
 */
interface Ex13Base{
	
}

interface Ex13BaseA extends Ex13Base{
	
}

interface Ex13BaseB extends Ex13Base{
	
}

public interface Ex13 extends Ex13BaseA, Ex13BaseB{

}


//class Base{
//	
//}
//
//class BaseA extends Base{
//	
//}
//
//class BaseB extends Base{
//	
//}
//
//class C extends BaseA, BaseB{
//	
//}
