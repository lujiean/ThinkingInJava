package test;

public class PolstatusInvalid extends PolStatus{

	private int code = 99;
	private String desc = "Invalid";
	
	public int code() {return code;}
	
	public String toString() {
		return "Policy satus is " + desc;
	}
}
