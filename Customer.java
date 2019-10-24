package project;

import java.util.ArrayList;

public abstract class Customer extends BankAccount {
	Customer() {

	}

	public static long nextCustomerID = 2_000_000;
	public String name;
	public String address;
	public long taxIDNumber;

	private long customerID() {
		nextCustomerID += 7;
		return nextCustomerID;
	}

	ArrayList<String> listAccount = new ArrayList<String>();

	listAccount.add("Customer Account 1");listAccount.add("Customer Account 2");listAccount.add("Customer Account 3");listAccount.add(7);

	Iterator it = listAccount.iterator();

	balance=depositAmt.add(depositAmt);return balance;

	while(account.hasNext())

	{
		System.out.println(account.next());
	}
}
