
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		//create An Account object and assign it to myAccount;
		Accounts myAccount = new Accounts("Jane Daniela", 60.7);
		Accounts myaccount = new Accounts("John Doe", -7.9);
		System.out.printf("%s balance: $%.2f%n", myAccount.getName(), myAccount.getBalance());
		System.out.printf("%s balance: $%.2f%n", myaccount.getName(), myaccount.getBalance());
		System.out.print("Please enter name: ");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.print("Enter deposit amount: ");
		double depositAmount = input.nextDouble();
		myAccount.deposit(depositAmount);
		System.out.printf("%s balance: $%.2f%n", myAccount.getName(), myAccount.getBalance());
		System.out.printf("%s balance: $%.2f%n", myaccount.getName(), myaccount.getBalance());
		

	}

}
