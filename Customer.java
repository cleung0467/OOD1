
package project;

import java.util.ArrayList;

public abstract class Customer extends BankAccount {
	Customer() {

	}

	public static long nextCustomerID = 2_000_000;
	private String name;
	private String address;
	private long taxIDNumber;

	public long customerID() {
		nextCustomerID += 7;
		return nextCustomerID;
	}
}
