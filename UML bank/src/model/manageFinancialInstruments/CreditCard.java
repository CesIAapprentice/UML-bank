package model.manageFinancialInstruments;

import model.manageAccounts.Account;

public class CreditCard extends Card{
	
	String number;
	Double debt;

	public CreditCard(String type, Double limit, Account account, String number, Double debt) {
		super(type, limit, account);
		this.number = "";
		this.debt = 0.0;
	}
	
	public boolean addToDebt() {
		return false;
	}

}
