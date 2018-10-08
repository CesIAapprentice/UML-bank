package model.manageFinancialInstruments;

import model.manageAccounts.Account;
import model.manageClients.Client;

public abstract class Card {
	
	private String type, number;
	private Client client;
	private Double limit;
	private Account account;
	
// ----------------------------------------------
// CONSTRUCTOR	
	
	public Card(String type, String number, Client client, Double limit, Account account) {
		this.type = type;
		this.number = number;
		this.client = client;
		this.limit = limit;
		this.account = account;
	}
	
// ----------------------------------------------
// METHODS		
	
	public abstract Account access();
	
// ----------------------------------------------
// GETTERS & SETTERS

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
		
	
	
}