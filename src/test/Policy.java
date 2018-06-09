package test;

public class Policy {
//	private final PolStatus pol_sta = new PolStatus();
	private final PolStatus pol_sta;
	private final PolNo pol_no;
	
	Policy(int code){
		// process pol_status
		switch (code) {
		case 40:
			pol_sta = new PolStatusInforce();
			break;

		default:
			pol_sta = new PolstatusInvalid();
			break;
		}
		
		// process pol_no
		pol_no = new PolNo();
	}
	public String getpolsta() {
		return pol_sta + "";
	}
	
	public String getPolNo() {
		return pol_no + "";
	}
	
	public void APL() {
		System.out.println("process APL, policy: " + pol_no);
		pol_sta.APL();
	}
}
