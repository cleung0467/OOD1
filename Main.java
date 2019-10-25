package project;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		
        BankAccount checking = new BankAccount();
		BankAccount Savings = new BankAccount();
		BigDecimal balance = new BigDecimal(1_000_000);
		long nextAccountID = 150_000;
		BigDecimal depositAmt = new BigDecimal(1_234_235);
		BigDecimal withdrawAmt = new BigDecimal(50);
		BigDecimal setBalance = new BigDecimal(0);
        BigDecimal setInterestRate = new BigDecimal(0);
      
      	System.out.println("Your Bank Account ID is " + BankAccount.makeAccountID());
		System.out.println("The User ID is " + nextAccountID);
		System.out.println("Your balance is " + "$" + balance);
		System.out.println("You deposited " + "$" + depositAmt);
		System.out.println("You withdrew " + "$" + withdrawAmt);
		System.out.println("You reset your balance to " + "$" + setBalance);
        System.out.println("The interest rate on your savings account is " + setInterestRate + "%");
	}
}
