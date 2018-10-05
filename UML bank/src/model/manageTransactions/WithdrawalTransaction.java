package model.manageTransactions;

import java.sql.Date;

import model.manageAccounts.Account;
import model.manageTransactions.ATMTransaction;

public class WithdrawalTransaction extends ATMTransaction {

	Double amount;
	
	public WithdrawalTransaction(String id, String type, Date date, Double amount) {
		super(id, type, date);
		this.amount = amount;
	}

	public boolean withdrawal(Account sourceAcc, Double amount) {
		return false;
	}

}
