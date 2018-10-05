package model.manageTransactions;

import java.sql.Date;

public class PinValidationTransaction extends ATMTransaction {

	String oldPin, newPin;
	
	public PinValidationTransaction(String id, String type, Date date, String oldPin, String newPin) {
		super(id, type, date);
		this.oldPin = oldPin;
		this.newPin = newPin;
	}

	public boolean pinChange(String pin) {
		String test = "";
		test += oldPin;
		oldPin = newPin;
		newPin = pin;
		return true;
	}
}