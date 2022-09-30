import java.util.ArrayList;
import java.util.Scanner;

public class TestDriver {

	static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		double wAmt = 2500;
		double dAmt = 3000;

		Account myAccount = new Account();
		SavingsAccount sAccount = new SavingsAccount();
		CheckingAccount cAccount = new CheckingAccount();
		Transaction myTrans = new Transaction();
		// myAccount.getId();
		// myAccount.getBalance();
		// myAccount.getAnnualInterestRate();
		double nBalance = myAccount.withdraw(wAmt);
		System.out.println("balance after withdraw = " + nBalance);
		double nnBalance = myAccount.deposit(dAmt);
		System.out.println("balance after deposit = " + nnBalance);
		System.out.println(myAccount.toString());
		System.out.println(cAccount.toString());
		System.out.println(sAccount.toString());

		myAccount.withdraw(wAmt);
		myAccount.withdraw(wAmt);
		myAccount.withdraw(wAmt);
		myAccount.deposit(30);
		myAccount.deposit(40);
		myAccount.deposit(50);
		System.out.println(myTrans.toString());
		// Account mytrans= new Account();

		// System.out.println(Account.);

	}
}
