package model.manageAccounts;

import model.manageClients.Client;

public class SavingAccount extends Account{
	
	private String accNumber;
	private Double balance, interest;

	public SavingAccount(String type, Client client, String thisAccNumber, Double amount, Double interest) {
		super(type, client, thisAccNumber, amount);
		this.interest = 0.10;
	}
	
	public boolean debit(Double amount) {
		return false;
	}
	
	public boolean credit(Double amount) {
		return false;
	}
}