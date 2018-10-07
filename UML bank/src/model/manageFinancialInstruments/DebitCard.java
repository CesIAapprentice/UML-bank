package model.manageFinancialInstruments;

import model.manageAccounts.Account;
import model.manageClients.Client;

public class DebitCard extends Card{
	
	private String number;

	public DebitCard(String type, Client client, Double limit, Account account, String number) {
		super(type, client, limit, account);
		this.number = "";
	}
	
	public boolean retrieveMoney(Account account) {
		return false;
	}

}
