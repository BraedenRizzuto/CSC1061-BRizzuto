
public class SalariedEmployee extends Employee
{
	private double weekSal;
	
	public SalariedEmployee()
	{
		
	}

	
	public SalariedEmployee(String firstName, String lastName, String ssn, double weekSal) {
		super(firstName, lastName, ssn);
		this.weekSal = weekSal;
	}


	

	@Override
	public String toString() {
		return "SalariedEmployee [weekSal=" + weekSal + ", firstName=" + firstName + ", lastName=" + lastName + ", ssn="
				+ ssn + "]";
	}


	public double getWeekSal() {
		return weekSal;
	}

	public void setWeekSal(double weekSal) {
		this.weekSal = weekSal;
	}
	
	@Override
	public double getPaymentAmount ()
	{
		return weekSal;
	}
}
