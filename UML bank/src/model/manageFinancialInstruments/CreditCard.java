package model.manageFinancialInstruments;

import model.manageAccounts.Account;
import model.manageClients.Client;

public class CreditCard extends Card{
	
	private String number;
	private Double debt;

	public CreditCard(String type, Client client, Double limit, Account account, String number, Double debt) {
		super(type, client, limit, account);
		this.number = "";
		this.debt = 0.0;
	}
	
	public boolean addToDebt() {
		return false;
	}

}
