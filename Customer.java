package project;

import java.util.ArrayList; //Use ArrayList

/** Customer inherits from BankAccount class */
public abstract class Customer extends BankAccount {
	Customer() {

	}

//Create variables
	public static long nextCustomerID = 2_000_000;
	private String name;
	private String address;
	private long taxIDNumber;

//Automatically generate customerID's
	public long customerID() {
		nextCustomerID += 7;
		return nextCustomerID;
	}
}
