package test;

public class PolNo {

	private final int polno;
	
	PolNo(){
		polno = PolNoCounter.GetNextPolNo();
	}
	public int getPolNo(){
		return polno;
	}
	
	public String toString() {
//		return Integer.toString(polno);
		return String.format("%08d", polno);
	}
}
