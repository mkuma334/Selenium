package pac1;

import java.util.Scanner;

public class BasicSalary {

	float calculateSalary(int s)
	{
		System.out.println("basic salary is " + s);
		float sal=s+(0.93F*s)+(0.63F*s);
		//System.out.println("sal in local method is " + sal);
		
		return sal;
		
		
	}
	
		 
		public  static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the salry");
			
			int  sal=s.nextInt();
			if(sal>12000)
			{
				BasicSalary s1=new BasicSalary();
				float grossSalary=s1.calculateSalary(sal);
				System.out.println("gross salary is " + grossSalary);
				
			}
		
		
	}

}
/*
 * class Sample1 {
 * 
 * public static void main(String[] args) { Scanner s=new Scanner(System.in);
 * System.out.println("enter the salry");
 * 
 * int sal=s.nextInt(); if(sal>12000) { BasicSalary s1=new BasicSalary(); float
 * grossSalary=s1.calculateSalary(sal); System.out.println("gross salary is " +
 * grossSalary);
 * 
 * } }
 * 
 * }
 */
	/*
	 * public static void main(String[] args) { new
	 * BasicSalary().calculateSalary(36000);
	 * 
	 * }
	 */

