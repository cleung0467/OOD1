package project;

/** Checking account inherits from BankAccount */
public class Checking extends BankAccount {
	Checking() {  //Constructor

	}

//Create variables
	private long nextCheckIssued;
	private long firstCheck;

/** Establish account type */
    public String setType(String accountType){
      return ("Checking");
    }
  
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
