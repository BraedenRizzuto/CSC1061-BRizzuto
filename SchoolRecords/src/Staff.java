
public class Staff extends Employee
{
	private String title;

	
	
	public Staff(String name, String adress, String phoneNumber, String emailAdress, String office, double salary,
			String dateHired, String title) {
		super(name, adress, phoneNumber, emailAdress, office, salary, dateHired);
		this.title= title;
	}




	public Staff()
	{
		title="oooo";
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	

	@Override
	public String toString() {
		return super.toString()+ "title="+ title;
	}

}

