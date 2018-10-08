import model.manageAccounts.Account;
import model.manageClients.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BranchOffice newOffice = new BranchOffice();
		newOffice.addClient();
		System.out.println("Client created");
		Client testClient = newOffice.managesClient("0");
		System.out.println(testClient);
		testClient.addAccount("SavingAccount");
		Account testSavingAccount = testClient.ownedAccounts().get("000000000001");
		System.out.println("Saving Account: " + testSavingAccount);
		testClient.addCard("CreditCard", testSavingAccount);
		System.out.println("Credit Cards: ");
		for(String creditCards : testClient.getCards().keySet()){
			System.out.println(creditCards + " " + testClient.getCards().get(creditCards));
		}
	}

}
