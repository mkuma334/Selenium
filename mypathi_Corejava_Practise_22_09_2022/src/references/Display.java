package references;

public class Display {

	public Student sd1;
	public Display(Student sd)
	{
		this.sd1=sd;
	}
	
	public void getDetails()
	{
		sd1.get();
	}
	
}
