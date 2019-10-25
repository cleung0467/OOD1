  package project;

import java.math.BigDecimal;

public class Savings extends BankAccount {
	Savings() {

	}

      public String setType(String accountType){
      return accountType;
    }
  
	BigDecimal interestRate = new BigDecimal(0);

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
}
