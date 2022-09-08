
public class CommissionEmployee extends Employee
{
	
	public double grossSal;
	public double comRate; 
	
	public CommissionEmployee()
	{
	
	}
	
	public CommissionEmployee(String firstName, String lastName, String ssn, double grossSal, double comRate) {
		super(firstName, lastName, ssn);
		this.grossSal = grossSal;
		this.comRate = comRate;
	}

	public double getGrossSal() {
		return grossSal;
	}
	public void setGrossSal(double grossSal) {
		this.grossSal = grossSal;
	}
	public double getComRate() {
		return comRate;
	}
	public void setComRate(double comRate) {
		this.comRate = comRate;
	}
	@Override
	public double getPaymentAmount()
	{
		return (grossSal * comRate);
	}

	@Override
	public String toString() {
		return "CommisionEmployee [grossSal=" + grossSal + ", comRate=" + comRate + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	
}
