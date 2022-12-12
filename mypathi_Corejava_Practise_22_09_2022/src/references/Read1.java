package references;

import java.util.Scanner;

import references.*;
public class Read1
{
	//Addres ad1 =new Addres();
	//Contact ct=new Contact();
	
    Student sd1=new Student( );
	
	/*
	 * Read1(Student s) { this.sd1=s; }
	 */
	
	
	public void read(Scanner sc)
	{
		//sd1=new Student();
		sc=new Scanner(System.in);
		
       System.out.println("enter the name");
		
	    sd1.name=sc.nextLine();
		
		System.out.println("enter the age");
		
		sd1.age=Integer.parseInt(sc.nextLine());
		
		//Student sd1=new Student( );
		
		System.out.println("enter the pincode");
		
		sd1.a.pincode=Integer.parseInt(sc.nextLine());
		
		System.out.println("enter the area");
		Student sd1=new Student( );
		
		sd1.a.area=sc.nextLine();
		
		System.out.println("enter the mail");
		
		sd1.c.mail=sc.nextLine();
		
		System.out.println("enter the phn number");
		
		sd1.c.phn=Integer.parseInt(sc.nextLine());
		sd1.get();
		
		
	
	}
	
	/*
	 * public void x() { //Student sd1=new Student();
	 * 
	 * sd1.get();
	 * 
	 * }
	 */
	
	public static void main(String[] args)
	{
      //Addres a=new Addres();
		
		//Contact c=new Contact();
		
		//Student s=new Student(a,c);
		Student s=new Student();
		
		Scanner s1=new Scanner(System.in);
		
		Read1 x=new Read1();
		Student x1=new Student();
		
		x.read(s1);
		
		Student  sd2=new Student( );
		Student  sd3=new Student( );
		//Read1 x1=new Read1();
		
		//x.x();
	}
	

}
