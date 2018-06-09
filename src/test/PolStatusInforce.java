package test;

public class PolStatusInforce extends PolStatus{

	private int code = 40;
	private String desc = "Inforce";
	
	public int code() {return code;}
	
	public String toString() {
		return "Policy satus is " + desc;
	}
	
	// process Inforce RPU process
	// process Invalid RPU process
	void APL() {
		System.out.println("Processing APL inforce");
	}
}
