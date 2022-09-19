
public class Employee extends AccountsPayable {

	private String firstName;
	private String lastName;
	private String ssn;

	public Employee() {
		String firstname = "oooo";
		String lastName = "oooo";
		String ssn = "0000000000";
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

	public double getPaymentAmount() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + getFirstName() + '\n' + ", lastName=" + getLastName() + '\n' + ", ssn="
				+ getSsn() + "]";
	}

}
