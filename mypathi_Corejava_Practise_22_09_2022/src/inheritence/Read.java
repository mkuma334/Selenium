package inheritence;

import java.util.Scanner;

public class Read extends Student
{

	public void read(Scanner s)
	{
		System.out.println("Enter the street of student ");
		super.street=s.nextLine();
		
		System.out.println("Enter the pincode of student ");
		
		super.Pincode=s.nextLine();
		
		System.out.println("enter the contact of student ");
		
		super.Contact=Integer.parseInt(s.nextLine());
		
		System.out.println("enter the name of student ");
		
		super.name=s.nextLine();
		
		System.out.println("enter the id  of  student ");
		
		super.id=s.nextInt();
		
		System.out.println("enter the rollNo of Student  ");
		
		super.rollNo=s.nextInt();
	}
}
