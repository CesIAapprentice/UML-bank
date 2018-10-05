package model.manageAccounts;

public class SavingAccount extends Account{
	
	Double interest;

	public SavingAccount(String type, String number, Double amount, Double interest) {
		super(type, number, amount);
		this.interest = 0.10;
	}
	
	

}
