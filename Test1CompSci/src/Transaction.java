import java.time.LocalDate;

public class Transaction extends Account {

	private String tType;
	private double transAmt;

	public Transaction(String name, int id, double balance, double annualInterestRate, LocalDate dateCreated,
			String tType, double transAmt) {
		super(name, id, balance, annualInterestRate, dateCreated);
		this.tType = tType;
		this.transAmt = transAmt;
	}

	public Transaction() {

		tType = "w or d";
		transAmt = 1000;

	}

	public String gettType() {
		return tType;
	}

	public void settType(String tType) {
		this.tType = tType;
	}

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	public double getBatAmt(double balance) {

		return balance;
	}

	@Override
	public String toString() {
		return "Transaction [gettType()=" + gettType() + ", getTransAmt()=" + getTransAmt() + ", getId()=" + getId()
				+ ", getBalance()=" + getBalance() + ", getAnnualInterestRate()=" + getAnnualInterestRate()
				+ ", getDateCreated()=" + getDateCreated() + ", getName()=" + getName() + "]";
	}

}
