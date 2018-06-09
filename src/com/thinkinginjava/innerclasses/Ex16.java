package com.thinkinginjava.innerclasses;

interface ItfCycle{
	String getName();
}

interface ItfCycleFactory{
	ItfCycle GetCycle();
}

class Unicycle implements ItfCycle{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "produce Unicycle";
	}
	
	public static ItfCycleFactory factory = new ItfCycleFactory(){

		@Override
		public ItfCycle GetCycle() {
			// TODO Auto-generated method stub
			return new Unicycle();
		}
		
	};
	
}

class Bicycle implements ItfCycle{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "produce Bicycle";
	}
	
	public static ItfCycleFactory factory = new ItfCycleFactory() {

		@Override
		public ItfCycle GetCycle() {
			// TODO Auto-generated method stub
			return new Bicycle();
		}
		
	};
	
}

class Tricycle implements ItfCycle{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "produce Tricycle";
	}
	
	public static ItfCycleFactory factory =  new ItfCycleFactory() {

		@Override
		public ItfCycle GetCycle() {
			// TODO Auto-generated method stub
			return new Tricycle();
		}
		
	};
	
}

//class UnicycleFactory implements ItfCycleFactory{
//	public ItfCycle GetCycle() {
//		return new  Unicycle();
//	}
//}

//class BicycleFactory implements ItfCycleFactory{
//	public ItfCycle GetCycle() {
//		return new Bicycle();
//	}
//}

//class TricycleFactory implements ItfCycleFactory{
//	public ItfCycle GetCycle() {
//		return new Tricycle();
//	}
//}

//public class Ex18 {
public class Ex16 {

	public static void ProduceCycle(ItfCycleFactory icf){
		System.out.println(icf.GetCycle().getName());
	}
	
	public static void main(String[] args) {
//		ProduceCycle(new UnicycleFactory());
//		ProduceCycle(new BicycleFactory());
//		ProduceCycle(new TricycleFactory());
		ProduceCycle(Unicycle.factory);
		ProduceCycle(Bicycle.factory);
		ProduceCycle(Tricycle.factory);
	}
}