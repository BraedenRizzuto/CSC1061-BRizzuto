
public class Employee extends AccountsPayable {

	  String firstName;
	  String lastName;
	  String ssn;
	
	public Employee() {

	}
	
	public Employee(String firstName, String lastName, String ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	

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

	
	public double getPaymentAmount()
	{
		return 0.0;
	}

	@Override
	public String toString() {
		return "Employee [firstName="+ firstName + '\n' + ", lastName=" + lastName + '\n' + ", ssn=" + ssn + "]";
	}

	
	
}

	