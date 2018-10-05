package model.manageFinancialInstruments;

import model.manageAccounts.Account;

public class DebitCard extends Card{
	
	String number;

	public DebitCard(String type, Double limit, Account account, String number) {
		super(type, limit, account);
		this.number = "";
	}
	
	public boolean retrieveMoney(Account account) {
		return false;
	}

}
