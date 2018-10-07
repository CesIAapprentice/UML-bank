package model.manageTransactions;

import java.sql.Date;

public class PinValidationTransaction extends ATMTransaction {

	private String oldPin, newPin;
	
	public PinValidationTransaction(String id, String type, Date date, String oldPin, String newPin) {
		super(id, type, date);
		this.oldPin = oldPin;
		this.newPin = newPin;
	}

	public boolean pinChange(String pin) {
		String temp = ""; 
		temp += this.newPin;
		this.newPin = pin;
		this.oldPin = temp;
		return true;
	}
}