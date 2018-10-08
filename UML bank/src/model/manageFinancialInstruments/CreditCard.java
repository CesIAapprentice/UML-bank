package model.manageFinancialInstruments;

import model.manageAccounts.Account;
import model.manageClients.Client;

public class CreditCard extends Card{
	
	private Double debt;
	
// ----------------------------------------------------------
// CONSTRUCTOR		

	public CreditCard(String type, String number, Client client, Double limit, Account account, Double debt) {
		super(type, number, client, limit, account);
		this.debt = 0.0;
	}
	
// ----------------------------------------------------------
// METHODS
	
	public boolean addToDebt(Double amount) {
		debt += amount;
		return true;
	}

	@Override
	public Account access() {
		return super.getAccount();
	}
}