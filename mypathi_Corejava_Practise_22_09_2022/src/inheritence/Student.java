package inheritence;

public class Student extends Contact 
{

	int id;
	
	int rollNo;
	
	public void  getAllDetails()
	{
		
		System.out.println(" Student street is "+ super.street);
		
		System.out.println("Student pincode is "+super.Pincode);
		
		System.out.println("student contacct is "+super.Contact);
		
		System.out.println("student name is "+super.name);
		
		System.out.println("student id is "+id);
		
		System.out.println("student rollNo is "+rollNo);
		
	}
}
