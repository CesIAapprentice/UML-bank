package model.manageAccounts;

import model.manageClients.Client;

public class CurrentAccount extends Account{
	
	private String accNumber;
	private Double balance, debitLimit;
	
	public CurrentAccount (String accNumber, String type, Client client, Double balance,
							String thisAccNumber, Double amount, Double debitLimit) {
		super(type, client, thisAccNumber, amount);
		this.debitLimit = -50.0;
		this.balance = 0.0;
	}
	
	public boolean debit(Double amount) {
		return false;
	}
	
	public boolean credit(Double amount) {
		return false;
	}

}