import java.util.Calendar;
import model.manageAccounts.Account;
import model.manageClients.Client;
import model.manageFinancialInstruments.Card;
import model.manageTransactions.PinManagementTransaction;

public class Main {

	public static void main(String[] args) {
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
			Card tempCard = testClient.getCards().get(creditCards);
			System.out.println(creditCards + " " + tempCard);
			System.out.println("PIN:" + tempCard.getPin());
			PinManagementTransaction changeMyPin = new PinManagementTransaction("001", "PINChange", Calendar.getInstance().getTime());
			System.out.println("New PIN: " + changeMyPin.pinChange(tempCard, "2059") + " -> " + tempCard.getPin());
			PinManagementTransaction validateMyPin = new PinManagementTransaction("002", "ValidatePIN", Calendar.getInstance().getTime());
			System.out.println(validateMyPin.pinVerification(tempCard, "2059"));
		}		
	}
}