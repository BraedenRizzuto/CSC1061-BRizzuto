
public class HourlyEmployee extends Employee
{
	double hourWage;
	double hrs;
	
	
	public HourlyEmployee()
	{
		
	}
	
public HourlyEmployee(double hourWage, double hrs) {
		super();
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

	
}
