package project;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		BankAccount checking = new BankAccount();
		Checking.setType();
		Checking.setBalance(0);

		BankAccount Savings = new BankAccount();
		Savings.setType("Savings");
		Savings.setBalance(0);
		Savings.setInterestRate();
		
		BigDecimal balance = new BigDecimal(1_000_000);
		long nextAccountID = 150_000;
		BigDecimal depositAmt = new BigDecimal(1_234_235);
		BigDecimal withdrawAmt = new BigDecimal(50);
		BigDecimal setBalance = new BigDecimal(0);

		System.out.println("The Account ID is " + nextAccountID);
		System.out.println("Your balance is " + balance);
		System.out.println("You deposited " + depositAmt);
		System.out.println("Your balance is now " + balance);
		System.out.println("You withdrew " + withdrawAmt);
		System.out.println("Your balance is now " + balance);
		System.out.println("You set your balance as " + setBalance);
		System.out.println("Your balance is now " + balance);
	}
}
