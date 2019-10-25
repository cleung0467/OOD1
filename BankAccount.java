/** This is a bank account. You are able to retrieve your account balance, deposit money and withdraw money.*/
package project;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BankAccount {
	private static long nextAccountID = 1000;
	private static BigDecimal balance;

/** This is the auto-generator for account ID's. It does not store anything and creates new variables every time the program runs.*/	
	public static long makeAccountID() {
		nextAccountID += 5;
		return nextAccountID;
	}
	
/** Get balance */
  	private BigDecimal getBalance() {
		return balance;
	}

	public void getBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
/** Deposit money and adds to the original balance */
	public static BigDecimal deposit(BigDecimal depositAmt) {
		balance = depositAmt.add(depositAmt);
		return balance;
	}

	public static BigDecimal withdraw(BigDecimal withdrawalAmt) {
		balance = balance.subtract(withdrawalAmt);
		return balance;
	}

/** Array list */
	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
}
