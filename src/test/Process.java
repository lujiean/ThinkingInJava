package test;

public class Process {

	public static void main(String[] args) {
		Policy a = new Policy(40);
		System.out.println(a.getpolsta());
		System.out.println(a.getPolNo());
		a.APL();		
		
		Policy b = new Policy(55);
		System.out.println(b.getpolsta());
		System.out.println(b.getPolNo());
		b.APL();
		
		Policy c = new Policy(66);
		System.out.println(c.getpolsta());
		System.out.println(c.getPolNo());
		c.APL();
	}
}
