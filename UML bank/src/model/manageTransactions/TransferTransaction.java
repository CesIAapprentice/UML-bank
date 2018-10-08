package model.manageTransactions;

import java.sql.Date;

import model.manageAccounts.Account;

public class TransferTransaction extends ATMTransaction {
	
	Double amount;
	Account sourceAcc, destinyAcc;
	
// ----------------------------------------------------------
// CONSTRUCTOR		

	public TransferTransaction(String id, String type, Date date, Double amount, Account sourceAcc, Account destinyAcc) {
		super(id, type, date);
		this.amount = amount;
		this.sourceAcc = sourceAcc;
		this.destinyAcc = destinyAcc;
	}
	
// ----------------------------------------------------------
// METHODS		

	public boolean transfer() {
		sourceAcc.setAmount(sourceAcc.getAmount() - this.amount);
		destinyAcc.setAmount(destinyAcc.getAmount() + this.amount);
		return true;
	}
	
// --------------------------------------------------------
// GETTERS & SETTERS	
	
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