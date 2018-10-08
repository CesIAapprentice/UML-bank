package model.manageTransactions;

import java.sql.Date;

import model.manageAccounts.Account;
import model.manageTransactions.ATMTransaction;

public class WithdrawalTransaction extends ATMTransaction {

	Double amount;
	Account account;
	
// ----------------------------------------------------------
// CONSTRUCTOR		
	
	public WithdrawalTransaction(String id, String type, Date date, Account account, Double amount) {
		super(id, type, date);
		this.account = account;
		this.amount = amount;
	}
	
// ----------------------------------------------------------
// METHODS		

	public boolean withdrawal() {
		account.setAmount(account.getAmount() - this.amount);
		return true;
	}
}