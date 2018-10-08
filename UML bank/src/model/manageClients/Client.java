package model.manageClients;

import java.util.HashMap;
import model.manageAccounts.Account;
import model.manageAccounts.CurrentAccount;
import model.manageAccounts.SavingAccount;
import model.manageFinancialInstruments.Card;
import model.manageFinancialInstruments.CreditCard;
import model.manageFinancialInstruments.DebitCard;

public class Client {
	
	String id, name, address;
	HashMap<String, Account> accounts;
	HashMap<String, Card> cards;
	
// ----------------------------------------------------------
// CONSTRUCTOR	
	
	public Client(String id) {
		this.id = id;
		this.name = "";
		this.address = "";
		this.accounts = new HashMap<String, Account>();
		this.cards = new HashMap<String,Card>();
	}
	
// ----------------------------------------------------------
// METHODS	
	
	public HashMap<String, Account> ownedAccounts() {
			return this.accounts;
	}
	
	public HashMap<String, Card> ownedCards() {
		return this.cards;
	}
	
	public boolean addAccount(String typeOfAccount) {
		System.out.println("Creating new Account");
		String AccNumber = getNewAccountNumber();
		if(typeOfAccount.equalsIgnoreCase("CURRENTACCOUNT")) {
			ownedAccounts().put(AccNumber, new CurrentAccount("CURRENTACCCOUNT", this, AccNumber, 0.0));
			System.out.println("Account number " + AccNumber + " created");
			return true;
		}
		
		if(typeOfAccount.equalsIgnoreCase("SAVINGACCOUNT")) {
			ownedAccounts().put(AccNumber, new SavingAccount("SAVINGACCOUNT", this, AccNumber, 0.0));
			System.out.println("Account number " + AccNumber + " created");
			return true;
		}
		
		return false;
	}
	
	public boolean addCard(String typeOfCard, Account account) {
		String CardNumber = getNewCardNumber();
		if(typeOfCard.equalsIgnoreCase("CREDITCARD")) {
			ownedCards().put(CardNumber, new CreditCard("CREDITCARD", CardNumber, this , -50.0 , account, 0.0));
			return true;
		}
		
		if(typeOfCard.equalsIgnoreCase("DEBITCARD")) {
			ownedCards().put(CardNumber, new DebitCard("DEBITCARD", CardNumber, this, -50.0, account));
			return true;
		}
		return false;
	}
	
	public String getNewAccountNumber() {
		Integer size = this.accounts.size();
		Integer digits = 0;
		while (size > 0) {
			size /=10;
			digits += 1;
		}
		
		String newAccNumber = "";
		for (Integer i=0; i < (11-this.accounts.size()); i++) {
			newAccNumber += "0";
		}
		
		newAccNumber += this.accounts.size() +1;
		return newAccNumber;
	}

	public String getNewCardNumber() {
		Integer size = this.cards.size();
		Integer digits = 0;
		while (size > 0) {
			size /=10;
			digits += 1;
		}
		
		String newCardNumber = "";
		for (Integer i=0; i < (12-this.cards.size()); i++) {
			newCardNumber += "0";
		}
		
		return newCardNumber;
	}
	
	
	
// --------------------------------------------------------
// GETTERS & SETTERS	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAccounts(HashMap<String, Account> accounts) {
		this.accounts = accounts;
	}

	public void setCards(HashMap<String, Card> cards) {
		this.cards = cards;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HashMap<String, Account> getAccounts() {
		return accounts;
	}

	public HashMap<String, Card> getCards() {
		return cards;
	}
}