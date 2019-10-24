package project;

import java.math.BigDecimal;

public class Savings extends BankAccount {
	Savings() {

	}

	BigDecimal interestRate = new BigDecimal(0);

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
}
