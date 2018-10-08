package model.manageTransactions;

import java.sql.Date;

public class QueryTransaction extends ATMTransaction {

	private String query, type;
	
// ----------------------------------------------------------
// CONSTRUCTOR	
	
	public QueryTransaction(String id, String type, Date date, String query, String type2) {
		super(id, type, date);
		this.query = query;
		this.type = type2;
	}
	
// ----------------------------------------------------------
// METHODS		
	
	public boolean queryProcessing() {
		// To be implemented
		return false;
	}
}