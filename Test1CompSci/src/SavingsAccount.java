import java.time.LocalDate;

public class SavingsAccount extends Account{
private double amtIn;
private double interest;
private double time;

public SavingsAccount(int id, double balance, double annualInterestRate, LocalDate dateCreated, double amtIn,
		double interest, double time) {
	super(id, balance, annualInterestRate, dateCreated);
	this.amtIn = amtIn;
	this.interest = interest;
	this.time = time;
}
public SavingsAccount()
{
	amtIn= 56000;
	interest= 4.5;
	time= 50;
}
@Override
public String toString() {
	return "SavingsAccount [amtIn=" + getAmtIn() + ", interest=" + getInterest() + "%, time=" + getTime() + "yrs]";
}
public double getAmtIn() {
	return amtIn;
}
public void setAmtIn(double amtIn) {
	this.amtIn = amtIn;
}
public double getInterest() {
	return interest/100;
}
public void setInterest(double interest) {
	this.interest = interest;
}
public double getTime() {
	return time;
}
public void setTime(double time) {
	this.time = time;
}

}
