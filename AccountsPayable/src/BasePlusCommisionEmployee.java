
public class BasePlusCommisionEmployee extends CommissionEmployee
{
	double basePay;
	
public BasePlusCommisionEmployee(String firstName, String lastName, String ssn, double grossSal, double comRate,
			double basePay) {
		super(firstName, lastName, ssn, grossSal, comRate);
		this.basePay = basePay;
	}

public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}



public BasePlusCommisionEmployee()
 {
	 
 }

@Override
public String toString() {
	return "BasePlusCommisionEmployee [basePay=" + basePay + ", grossSal=" + grossSal + ", comRate=" + comRate
			+ ", firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
}
@Override
public double getPaymentAmount()
{
	return (basePay+comRate);
}
}