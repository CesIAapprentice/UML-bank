package model.manageClients;

import model.manageAccounts.Account;
import model.manageFinancialInstruments.Card;
import model.manageTransactions.ATMTransaction;

public class Client {
	String name, address;
	Account account;
	Card card;
	
	public Client() {
		this.name = "";
	}
	
	public boolean makeTransaction(ATMTransaction transaction) {
		return false;
	}
}