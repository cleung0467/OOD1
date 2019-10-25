package project;

import java.math.BigDecimal; //Use BigDecimal

//Savings inherits from BankAccount
public class Savings extends BankAccount {
	Savings() {

	}

//Set type of account
      public String setType(String accountType){
      return accountType;
    }
  
//Initiate interest rate to O
	BigDecimal interestRate = new BigDecimal(0);

//Get and Set interest rate
	private BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
}
