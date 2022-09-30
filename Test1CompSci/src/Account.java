import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {

	ArrayList<Transaction> transactions = new ArrayList<Transaction>();

	static Scanner input;
	// input = new Scanner(System.in);
	private String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	private LocalDate dateCreated;

	public Account(String name, int id, double balance, double annualInterestRate, LocalDate dateCreated) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}

	public Account() {
		name = "George";
		id = 1122;
		balance = 1000;
		annualInterestRate = 1.5;
		dateCreated = java.time.LocalDate.now();

	}

	public double deposit(double dAmt) {
		// for (int i=0; i<transactions.size();i++)

		Transaction myDeposit = new Transaction();
		transactions.add(myDeposit);
		balance = balance + dAmt;
		// System.out.println(transactions.indexOf(i));

		return balance;
	}

	public double withdraw(double wAmt) {

		// for (int i=0; i< transactions.size();i++)
		Transaction myWithdraw = new Transaction();
		transactions.add(myWithdraw);
		balance = balance - 2500;
		// System.out.println(transactions.indexOf(i));

		return balance;
	}

	public double getmonthlyInterest(double balance) {

		return balance * (annualInterestRate / 12);
	}

	public double getMonthlyInterestRate(double annualInterestRate) {
		return annualInterestRate / 12;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate / 100;
	}

	public LocalDate getDateCreated() {

		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [name =" + getName() + " id=" + getId() + ", balance=" + getBalance() + ", annualInterestRate="
				+ getAnnualInterestRate() + "%, dateCreated=" + dateCreated + "]";
	}
}
