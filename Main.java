package project;

import java.math.BigDecimal; //Use BigDecimal

public class Main {
	public static void main(String[] args) {

/** Call To methods */
                BankAccount checking = new BankAccount(); //Make checking account
		BankAccount Savings = new BankAccount();  //Make savings account
		BigDecimal balance = new BigDecimal(1_000_000);  //Get Balance
		long nextAccountID = 150_000;  //get Account ID
		BigDecimal depositAmt = new BigDecimal(1_234_235); //Get deposit amount
		BigDecimal withdrawAmt = new BigDecimal(50);  //Get withdrawl amount
		BigDecimal setBalance = new BigDecimal(0); //Set balance to any number
        BigDecimal setInterestRate = new BigDecimal(0); //Set interest rate
      
/** Print out Call To's */		
      		System.out.println("Your Bank Account ID is " + BankAccount.makeAccountID()); 
		System.out.println("The User ID is " + nextAccountID);
		System.out.println("Your balance is " + "$" + balance);
		System.out.println("You deposited " + "$" + depositAmt);
		System.out.println("You withdrew " + "$" + withdrawAmt);
		System.out.println("You reset your balance to " + "$" + setBalance);
       	 	System.out.println("The interest rate on your savings account is " + setInterestRate + "%");
		System.out.println(Checking.firstCheckIssued());  
		System.out.println(Checking.getFirstCheck());
	}
}
