
public class HourlyEmployee extends Employee
{
	 double hourWage;
	 double hrs;
	
	
	public HourlyEmployee()
	{
		double hourWage= 0.0;
		double hrs=0.0;
	}

public HourlyEmployee(String firstName, String lastName, String ssn, double hourWage, double hrs) {
		super(firstName, lastName, ssn);
		this.hourWage = hourWage;
		this.hrs = hrs;
	}



public double getHourWage() {
	return hourWage;
}

public void setHourWage(double hourWage) {
	this.hourWage = hourWage;
}

public double getHrs() {
	return hrs;
}

public void setHrs(double hrs) {
	this.hrs = hrs;
}
@Override
public double getPaymentAmount ()
{
	return (hourWage * hrs);
}
	

@Override
public String toString() {
	return "HourlyEmployee [hourWage=" + hourWage + ", hrs=" + hrs + ", firstName=" + firstName + ", lastName="
			+ getLastName() + ", ssn=" + ssn + "]";
}
}

