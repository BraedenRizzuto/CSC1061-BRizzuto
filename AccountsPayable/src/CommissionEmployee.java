
public class CommissionEmployee extends Employee {

	private double grossSale;
	private double comRate;

	public CommissionEmployee() {
		double grossSale = 0.0;
		double comRate = 0.0;
	}

	public CommissionEmployee(String firstName, String lastName, String ssn, double grossSale, double comRate) {
		super(firstName, lastName, ssn);
		this.grossSale = grossSale;
		this.comRate = comRate;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSal(double grossSale) {
		this.grossSale = grossSale;
	}

	public double getComRate() {
		return comRate;
	}

	public void setComRate(double comRate) {
		this.comRate = comRate;
	}

	@Override
	public double getPaymentAmount() {
		return (grossSale * comRate);
	}

	@Override
	public String toString() {
		return "CommisionEmployee [grossSal=" + getGrossSale() + ", comRate=" + getComRate() + ", firstName="
				+ getFirstName() + ", lastName=" + getLastName() + ", ssn=" + getSsn() + "]";
	}

}
