
public class Staff extends Employee
{
	private String title;

	public Staff(String title) {
		super();
		this.title = title;
	}
	
	
	public Staff()
	{
		title="oooo";
	}


	

	@Override
	public String toString() {
		return super.toString()+ "title="+ title;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
}

