package project;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BankAccount {
	public static long nextAccountID = 1000;
	public static BigDecimal balance;

	public static long makeAccountID() {
		nextAccountID += 5;
		return nextAccountID;
	}
  
  	public BigDecimal getBalance() {
		return balance;
	}

	public void getBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public static BigDecimal deposit(BigDecimal depositAmt) {
		balance = depositAmt.add(depositAmt);
		return balance;
	}

	public static BigDecimal withdraw(BigDecimal withdrawalAmt) {
		balance = balance.subtract(withdrawalAmt);
		return balance;
	}

	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
}
