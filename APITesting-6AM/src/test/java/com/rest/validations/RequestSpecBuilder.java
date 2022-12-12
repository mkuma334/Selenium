package com.rest.validations;

public class RequestSpecBuilder 
{
	/*
	 * public RequestSpecBuilder(String lastname) { // TODO Auto-generated
	 * constructor stub System.out.println(lastname); }
	 */
	public static RequestSpecification build()
	{
	     class imp  implements RequestSpecification
		{
			public void spec()
			{
				System.out.println("spec method is implemented is succesfully");
			}
		}
	     imp obj =new imp();
	     System.out.println("spec method is implemented succesfully");
	     
	     return obj;
		
	}
	
	public static void main(String[] args)
	{
		RequestSpecification x=RequestSpecBuilder.build();
	}
}
