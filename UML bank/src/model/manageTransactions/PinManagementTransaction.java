package model.manageTransactions;

import java.util.ArrayList;
import java.util.Date;

import model.manageFinancialInstruments.Card;

public class PinManagementTransaction extends ATMTransaction {

	private ArrayList<String> oldPin;
	
	public PinManagementTransaction(String id, String type, Date date) {
		super(id, type, date);
		this.oldPin = new ArrayList<String>();
	}

	public boolean pinChange(Card card, String pin) {
		oldPin.add(card.getPin());
		card.setPin(pin);
		return true;
	}
	
	public boolean pinVerification(Card card, String pin) {
		return card.getPin().equals(pin);
	}
}