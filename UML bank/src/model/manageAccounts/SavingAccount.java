package model.manageAccounts;

import model.manageClients.Client;

public class SavingAccount extends Account{
	
	private String accNumber;
	private Double balance, interest;

	public SavingAccount(String type, Client client, String thisAccNumber, Double amount) {
		super(type, client, thisAccNumber, amount);
		this.interest = 0.10;
	}

//-------------------------------------------------------------------------------------
// METHODS
	
	@Override
	public Double retrieve(Double amount) {
		balance -= amount;
		return amount;
	}
	
//-------------------------------------------------------------------------------------
// GETTERS & SETTERS		
	
	public boolean debit(Double amount) {
		return false;
	}
	
	public boolean credit(Double amount) {
		return false;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}
}