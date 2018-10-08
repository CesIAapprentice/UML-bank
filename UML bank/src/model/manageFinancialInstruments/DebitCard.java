package model.manageFinancialInstruments;

import model.manageAccounts.Account;
import model.manageClients.Client;

public class DebitCard extends Card{
	
// ----------------------------------------------------------
// CONSTRUCTOR		
	
	public DebitCard(String type, String number, String pin, Client client, Double limit, Account account) {
		super(type, number, pin, client, limit, account);
	}
	
// ----------------------------------------------------------
// METHODS
	
	public boolean retrieveMoney(Account account) {
		return false;
	}

@Override
	public Account access() {
		return super.getAccount();
	}
	
	
}