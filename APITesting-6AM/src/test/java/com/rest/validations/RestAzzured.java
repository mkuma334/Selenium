package com.rest.validations;

public class RestAzzured  extends RequestSpecBuilder {
	public static RequestSpecification requestspecification;
    
	public RequestSpecBuilder requestspecbulder;
	
    static	String  s=new String ("manoj");
	
    RequestSpecBuilder x1;
    
	public static  void spec (Object x1)
	{
		//requestspecification = RequestSpecBuilder.build();
		
		//return x;
		//System.out.println("methos in resgtassured " + requestspecification);
		
		System.out.println(x1);
             
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestSpecBuilder obj= new RequestSpecBuilder();
		requestspecification=obj.build();
		
		
		
		RestAzzured.spec(requestspecification);
		//requestspecification  =RequestSpecBuilder.build();
	//	x.build();
		
	        
	        
	        
	        
		
		
		
		
	}

}
