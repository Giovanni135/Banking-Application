package bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// String file = "C:\\Users\\hayse\\OneDrive\\Desktop\\Java Projects\\Files\\NewBankAccounts.csv";
		
		
		Checking chkacc1 = new Checking("Tom Wilson", "584791329", 1500);
		Savings savacc1 = new Savings("Mandy Rogerson", "187452154", 2500);
		
		savacc1.showInfo();
		System.out.println("********************");
		chkacc1.showInfo();
		
		
		/* List<String[]> newAccountHolders = utilities.csv.read(file);
		for (String[] accountHolder : newAcountHolders) {
			System.out.println(accountHolder[0]);
		}
		*/
	}

}
