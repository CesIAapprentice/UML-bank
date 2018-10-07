package model.manageFinancialInstruments;

import model.manageAccounts.Account;
import model.manageClients.Client;

public abstract class Card {
	
	private String type;
	private Client client;
	private Double limit;
	private Account account;
	
	public Card(String type, Client client, Double limit, Account account) {
		this.type = type;
		this.client = client;
		this.limit = limit;
		this.account = account;
	}
	
	

}
