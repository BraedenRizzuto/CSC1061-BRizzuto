
public class Student extends Person{
	private String status;

	public Student(String status) {
		super();
		this.status = status;
	}
	
	public Student ( )
	{
		status = "ooo";
	}

	

	@Override
	public String toString() {
		return super.toString()+ "status="+ status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
