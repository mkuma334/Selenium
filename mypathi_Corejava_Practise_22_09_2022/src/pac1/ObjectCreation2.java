package pac1;

import pac1.*;
public class ObjectCreation2 {

	ObjectCreation x1=new ObjectCreation();
	
  
	
	public void m2()
	{
		/*
		 * ObjectCreation x1=new ObjectCreation(); x1.m1();
		 */
		x1.a=10;
		
		System.out.println("m2 ie executed in second class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ObjectCreation2 y=new ObjectCreation2();
 y.m2();
	}

}
