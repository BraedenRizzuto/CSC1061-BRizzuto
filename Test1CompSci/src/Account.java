import java.time.LocalDate;
import java.util.Scanner;

public class Account {
	static Scanner input;
	//input = new Scanner(System.in);
private int id;
private double balance;
private double annualInterestRate;
private LocalDate dateCreated;

public Account(int id, double balance, double annualInterestRate, LocalDate dateCreated) {
	super();
	this.id = id;
	this.balance = balance;
	this.annualInterestRate = annualInterestRate;
	this.dateCreated = dateCreated;
} 
public Account(){
	id= 1122;
	balance= 20000;
	annualInterestRate=4.5;
	dateCreated= java.time.LocalDate.now();
	
	
	
}
public double deposit(double dAmt) 
{
	balance= balance+dAmt;
	return balance;
}

@Override
public String toString() {
	return "Account [id=" + getId() + ", balance=" + getBalance() + ", annualInterestRate=" + getAnnualInterestRate()
			+ "%, dateCreated=" + dateCreated + "]";
}
public double withdraw(double wAmt)
{
	balance = balance- wAmt;
	return balance;
}
public double getmonthlyInterest(double balance)
{
	
	return balance*(annualInterestRate/12);
}
public double getMonthlyInterestRate(double annualInterestRate)
{
	return annualInterestRate/12;
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
	return annualInterestRate/100;
}
public LocalDate getDateCreated() {
	 
	return getDateCreated();
}
public void setDateCreated(LocalDate dateCreated) {
	this.dateCreated = dateCreated;
}
public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}


}
