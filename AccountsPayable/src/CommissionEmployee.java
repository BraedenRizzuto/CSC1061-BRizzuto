
public class CommissionEmployee extends Employee
{
	
	 double grossSale;
	 double comRate; 
	 double basePay;
	
	public CommissionEmployee()
	{
		double grossSale= 0.0;
		double comRate=0.0;
		
	}
	
	public CommissionEmployee(String firstName, String lastName, String ssn, double grossSale, double comRate) {
		super(firstName, lastName, ssn);
		this.grossSale = grossSale;
		this.comRate = comRate;
		
	}
	public double findBasePay()
	{
		System.out.println("enter employees base pay");
		basePay=input.nextDouble();
		System.out.println(basePay);
		return basePay;
	}
	

	public double getGrossSal() {
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
	public double getPaymentAmount()
	{
		return (grossSale * comRate);
	}

	@Override
	public String toString() {
		return "CommisionEmployee [grossSal=" + grossSale + ", comRate=" + comRate + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	
}
