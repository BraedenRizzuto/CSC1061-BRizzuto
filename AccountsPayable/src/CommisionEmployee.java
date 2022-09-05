
public class CommisionEmployee 
{
	BasePlusCommisionEmployee bc= new BasePlusCommisionEmployee();
	double grossSal;
	double comRate; 
	
	public CommisionEmployee()
	{
	
	}
	
	public CommisionEmployee(double grossSal, double comRate) {
		super();
		this.grossSal = grossSal;
		this.comRate = comRate;
	}
	public double getGrossSal() {
		return grossSal;
	}
	public void setGrossSal(double grossSal) {
		this.grossSal = grossSal;
	}
	public double getComRate() {
		return comRate;
	}
	public void setComRate(double comRate) {
		this.comRate = comRate;
	}
	
}
