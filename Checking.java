package project;

public class Checking extends BankAccount {
	Checking() {

	}

	private long nextCheckIssued;
	private long firstCheck;

	public long nextCheckIssued() {
		nextCheckIssued += 1;
		return nextCheckIssued;

	}

	public long getFirstCheck() {
		return firstCheck;
	}

	public void setFirstCheck(long firstCheck) {
		this.firstCheck = firstCheck;
	}
}