package com.rest.validations;

public class PractiseClass4 
{
	PractiseClass3 practiseclass3;
	public PractiseClass4(PractiseClass3 practiseclass3) {
		// TODO Auto-generated constructor stub
		super();
		
		this.practiseclass3=practiseclass3;
	}
	
	
	public static void main(String[] args)
	{
		PractiseClass3 obj1=new PractiseClass3("shiva");
		
		PractiseClass4 obj2=new PractiseClass4(obj1);
		
		System.out.println(obj2);
		 
	}

}
