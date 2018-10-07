import java.util.ArrayList;

import model.manageClients.Client;
import model.manageFinancialInstruments.DebitCard;

public class BranchOffice {
	
	String code, address;
	ArrayList<Client> customers;
	
	public BranchOffice() {
		this.address = "";
		this.code = "";
		this.customers = new ArrayList<Client>();
	}
	
	public boolean managesDebitCard(DebitCard debitcard) {
		return false;
	}
}