package model.manageAccounts;

import model.manageClients.Client;

public abstract class Account {
	
	private Client client;
	private String type, number;
	private Double amount;
	
	public Account(String type, Client client, String number, Double amount) {
		this.client = client;
		this.type = type;
		this.number = number;
		this.amount = amount;
	}

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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	

}
