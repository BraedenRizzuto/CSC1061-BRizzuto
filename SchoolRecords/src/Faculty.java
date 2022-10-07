
public class Faculty extends Employee 
{
	private String officeHrs;
	private String rank;
	
	
	public Faculty(String name, String adress, String phoneNumber, String emailAdress, String office, double salary,
			String dateHired, String officeHrs, String rank) {
		super(name, adress, phoneNumber, emailAdress, office, salary, dateHired);
		this.officeHrs=officeHrs;
		this.rank=rank;
	}

	public Faculty( )
	{
		officeHrs= "0000000";
		 rank = "oooooo";
	}

	public String getOfficeHrs() {
		return officeHrs;
	}

	public void setOfficeHrs(String officeHrs) {
		this.officeHrs = officeHrs;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString()+ ", office hours="+ officeHrs + ", rank="+ rank;
	}

	
	
	
}

