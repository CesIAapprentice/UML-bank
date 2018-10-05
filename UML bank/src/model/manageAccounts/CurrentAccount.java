package model.manageAccounts;

public class CurrentAccount extends Account{
	
	Double debitLimit;
	
	public CurrentAccount (String type, String number, Double amount, Double debitLimit) {
		super(type, number, amount);
		this.debitLimit = -50.0;
	}

}
