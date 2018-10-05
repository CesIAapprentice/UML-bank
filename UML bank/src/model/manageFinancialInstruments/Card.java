package model.manageFinancialInstruments;

import model.manageAccounts.Account;

public abstract class Card {
	
	String type;
	Double limit;
	Account account;
	
	public Card(String type, Double limit, Account account) {
		this.type = type;
		this.limit = limit;
		this.account = account;
	}
	
	

}
