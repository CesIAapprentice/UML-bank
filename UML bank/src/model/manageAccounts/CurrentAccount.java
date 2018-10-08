package model.manageAccounts;

import model.manageClients.Client;

public class CurrentAccount extends Account{
	
	private String accNumber;
	private Double balance, debitLimit;
	
	public CurrentAccount (String type, Client client, String thisAccNumber, Double amount) {
		super(type, client, thisAccNumber, amount);
		this.debitLimit = -50.0;
		this.balance = 0.0;
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

	public Double getDebitLimit() {
		return debitLimit;
	}

	public void setDebitLimit(Double debitLimit) {
		this.debitLimit = debitLimit;
	}


	
	

}