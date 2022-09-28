import java.time.LocalDate;

public class CheckingAccount extends Account {
private double overDraftLimit;

public CheckingAccount(int id, double balance, double annualInterestRate, LocalDate dateCreated,
		double overDraftLimit) {
	super(id, balance, annualInterestRate, dateCreated);
	this.overDraftLimit = overDraftLimit;
}

public CheckingAccount()
{
	overDraftLimit= 2000;
}

@Override
public String toString() {
	return "CheckingAccount [overDraftLimit=" + getOverDraftLimit() + "]";
}

public double getOverDraftLimit() {
	return overDraftLimit;
}

public void setOverDraftLimit(double overDraftLimit) {
	this.overDraftLimit = overDraftLimit;
}


}
