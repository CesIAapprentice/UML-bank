package model.manageTransactions;

import java.sql.Date;

import model.manageAccounts.Account;

public class TransferTransaction extends ATMTransaction {
	
	Double amount;
	Account destinyAcc;

	public TransferTransaction(String id, String type, Date date, Double amount, Account destinyAcc) {
		super(id, type, date);
		this.amount = amount;
		this.destinyAcc = destinyAcc;
	}

	public boolean transfer() {
		return false;
	}
	
	public Double getAmount() {
		return this.getAmount();
	}
	
	public void setAmount(Double amount) {
		this.setAmount(amount);
	}
	
	public Account getSourceAcc() {
		return this.getSourceAcc();
	}
	
	public void setSourceAcc(Account sourceAcc) {
		this.setSourceAcc(sourceAcc);
	}

	public Account getDestinyAcc() {
		return destinyAcc;
	}

	public void setDestinyAcc(Account destinyAcc) {
		this.destinyAcc = destinyAcc;
	}
}