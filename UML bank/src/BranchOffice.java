import java.util.HashMap;

import model.manageAccounts.Account;
import model.manageClients.Client;
import model.manageFinancialInstruments.Card;

public class BranchOffice {
	
	String code, address;
	HashMap<String, Client> customers;
	
// ----------------------------------------------------------
// CONSTRUCTOR		
	
	public BranchOffice() {
		this.address = "";
		this.code = "";
		this.customers = new HashMap<String, Client>();
	}
	
// ----------------------------------------------------------
// METHODS		
		
	public Card managesCard(Client client, String number) {
		return client.ownedCards().get(number);
	}
	
	public Account managesAccount(Client client, String number) {
		return client.ownedAccounts().get(number);
	}
	
	public boolean addClient() {
		String id = String.valueOf(this.customers.size());
		this.customers.put(id, new Client(id));
		System.out.println("Client " + id + " added");
		System.out.println("Clients added: ");
		for (String client : this.customers.keySet()) {
			System.out.println(client + " " + this.customers.get(client));
		}
		return true;
	}
	
	public Client managesClient(String id) {
		System.out.println("Client " + id + " - " + this.customers.get(id) + " requested");
		return this.customers.get(id);
	}
	
}