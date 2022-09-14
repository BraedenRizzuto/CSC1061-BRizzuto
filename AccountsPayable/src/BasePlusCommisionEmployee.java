
public class BasePlusCommisionEmployee extends CommissionEmployee {
	double basePay;

	public BasePlusCommisionEmployee() {
		double basePay = 0.0;
	}

	public BasePlusCommisionEmployee(String firstName, String lastName, String ssn, double grossSale, double comRate,
			double basePay) {
		super(firstName, lastName, ssn, grossSale, comRate);
		this.basePay = basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	public double getBasePay() {
		return basePay;
	}

	@Override
	public String toString() {
		return "BasePlusCommisionEmployee [basePay=" + basePay + ", grossSal=" + grossSale + ", comRate=" + comRate
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}

	@Override
	public double getPaymentAmount() {
		return (basePay + comRate);
	}
}