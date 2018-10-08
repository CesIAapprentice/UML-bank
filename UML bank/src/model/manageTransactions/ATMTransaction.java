package model.manageTransactions;

import java.sql.Date;

public abstract class ATMTransaction {
	
	private String id, type;
	private Date date;
	
// ----------------------------------------------------------
// CONSTRUCTOR	
	
	public ATMTransaction(String id, String type, Date date) {
		this.id = id;
		this.date = date;
		this.type = type;
	}
	
// ----------------------------------------------------------
// METHODS		
	
	public boolean modifies(String whatToModify, Object newParameter) {
		return false;
	}
	
// --------------------------------------------------------
// GETTERS & SETTERS

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

	
	
	
}