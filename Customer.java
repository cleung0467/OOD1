
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
}
