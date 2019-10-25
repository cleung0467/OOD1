package project;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Account checking = new Account();
		checking.setType("Checking");
		checking.setBalance(0);

		Account savings = new Account();
		savings.setType("Savings");
		savings.setBalance(0);
		savings.setRate(2.00);
		
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
