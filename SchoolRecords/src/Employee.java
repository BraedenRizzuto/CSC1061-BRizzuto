
public class Employee extends Person 
{
	private String office;
	private double salary;
	private String dateHired;
	
	public Employee(String name, String adress, String phoneNumber, String emailAdress, String office, double salary,
			String dateHired) {
		super(name, adress, phoneNumber, emailAdress);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	public Employee() {
		 office = "oooooo";
		 salary=0.0;
		 dateHired= "0/0/0";
	}

	@Override
	public String toString() {
		return super.toString()+ "office="+ office + ", salary="+ salary +", date hired="+ dateHired;
	}
	

	
	
	
	
}
