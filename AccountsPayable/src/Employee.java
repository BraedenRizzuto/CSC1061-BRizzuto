
public class Employee 
{
	
	SalariedEmployee se = new SalariedEmployee();
	HourlyEmployee he= new HourlyEmployee();
	CommisionEmployee ce=new CommisionEmployee();
	
	String firstName;
	String lastName;
	String ssn;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	
	



public Employee(String firstName, String lastName, String ssn) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.ssn = ssn;
}

@Override
public String toString() {
	return 
	"Employee [firstName=" + firstName + 
	", lastName=" + lastName + 
	", ssn=" + ssn + "]";
}



public void getPaymentAmt()
{
	
	System.out.println("weekly salary is "+ se.weekSal);
	System.out.println("The payment amount is "+ ce.grossSal*ce.comRate);
	System.out.println("the payment amount is "+ he.hrs*he.hourWage);
	//System.out.println("the payment amount is "+ bc.basePay+ce.comRate  ) ;
}


public Employee()
{
	
}









}