package references;

import references.*;
public class Student {

	public String name;
	
	public int age ;
	
	public Addres a=new Addres();
	
	public Contact c=new Contact();
	  
	/*
	 * Student() { System.out.println("o constructor"); }
	 */
	
	
	//  Student (Addres ad ,Contact ct) { this.a=ad; this.c=ct; }
	 
	 
	public void get()
	{
		System.out.println("name is modified  " + name);
		
		System.out.println("age is modified " + age);
		
		a.m1();
		c.m2();
		
	}
	
	

}
