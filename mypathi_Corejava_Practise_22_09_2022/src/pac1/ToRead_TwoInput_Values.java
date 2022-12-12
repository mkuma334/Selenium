package pac1;

import java.util.Scanner;

public class ToRead_TwoInput_Values 
{    
	static int addition (int a1,int a2)
	{
		return a1+a2;
	}
	
	static	int subraction (int a2,int a3)
	{
		return a2-a3;
	}
	static int multiplication (int a4,int a5)
	{
		return a4*a5;
	}
	
	static int division(int a6,int a7)
	{
		return a6/a7;
	}
	
	public static void main (String [] args)
	{
	 //	System.out.println("Enter the choice " + "addition-1" + " subraction" + " multiplication" + " division");
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the choice " + "addition->1," + " subraction->2," + " multiplication->3," + " division->");
		
		int choice =s.nextInt();
		
		
		System.out.println("enter the value 1");
		
		int value1=s.nextInt();
		System.out.println("Enter the value 2");
		int value2=s.nextInt();
		
		switch (choice) {
		case 1: {
			
			int add=ToRead_TwoInput_Values.addition(value1, value2);
			System.out.println("added value is " + add);
			break;
			
		}
		case 2:{
		   int sub=ToRead_TwoInput_Values.subraction(value1, value2);
		   System.out.println("sub value is " + sub);
		   break;
		}
		default:
		{
			System.out.println("no value");
			break;
		}

		}//end of switch
		System.out.println("your job is done");
		
		

}
}
