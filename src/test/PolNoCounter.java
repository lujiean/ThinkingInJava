package test;

public class PolNoCounter {

//	private PolNoCounter pnc = new PolNoCounter();
	private static int polno;
	private PolNoCounter() {
		polno = 0;
	}
	public static int GetNextPolNo() {
		return polno++;
	}
}
