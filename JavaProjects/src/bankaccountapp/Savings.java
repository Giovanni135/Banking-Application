package bankaccountapp;

public class Savings extends Account {
	//Properties for Savings 
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initilalize Savings properties
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override 
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
		// Methods specific to Savings
		
		public void showInfo() {
			super.showInfo();
			System.out.println(
					"Your Savings Account Features" + 
					"\n Safety Deposit Box ID: " + safetyDepositBoxID +
					"\n Safety Deposit Box Key: " + safetyDepositBoxKey
					);
		}
}
