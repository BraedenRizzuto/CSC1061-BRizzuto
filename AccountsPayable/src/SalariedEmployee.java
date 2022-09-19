
public class SalariedEmployee extends Employee {
	private double weekSal;

	public SalariedEmployee() {
		double weeksal = 0.0;
	}

	public SalariedEmployee(String firstName, String lastName, String ssn, double weekSal) {
		super(firstName, lastName, ssn);
		this.weekSal = weekSal;
	}

	public double getWeekSal() {
		return weekSal;
	}

	public void setWeekSal(double weekSal) {
		this.weekSal = weekSal;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weekSal=" + getWeekSal() + ", firstName=" + getFirstName() + ", lastName="
				+ getLastName() + ", ssn=" + getSsn() + "]";
	}

	@Override
	public double getPaymentAmount() {
		return weekSal;
	}
}
