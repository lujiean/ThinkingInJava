package test;

public class Item {

	private int i;
	public Item next;
	public Item(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
		System.out.println("Construct Item: " + i);		
	}
	
	public String toString() {
		String str = "Current Item: " + i;
		return str;
	}
}
