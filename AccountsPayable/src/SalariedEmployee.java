
public class SalariedEmployee extends Employee
{
	 double weekSal;
	
	public SalariedEmployee()
	{
		double weeksal= 0.0;
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
		return "SalariedEmployee [weekSal=" + weekSal + ", firstName=" + firstName + ", lastName=" + lastName + ", ssn="
				+ ssn + "]";
	}

	@Override
	public double getPaymentAmount ()
	{
		return weekSal;
	}
}
