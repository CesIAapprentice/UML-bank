import java.util.ArrayList;

import model.manageClients.Client;

public class BranchOffice {
	
	String code, address;
	ArrayList<Client> customers;
	
	public BranchOffice() {
		this.address = "";
		this.code = "";
		this.customers = new ArrayList<Client>();
	}
	
	public boolean managesClient(Client client) {
		return false;
	}
}