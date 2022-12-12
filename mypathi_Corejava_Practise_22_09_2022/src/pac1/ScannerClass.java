package pac1;

import java.util.Scanner;

public class ScannerClass {
   
	public static void m1()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
	String	name =s.nextLine();
	System.out.println(name);
	}
	static String m2()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the surname");
		String surname=s1.nextLine();
		System.out.println(surname);
		return surname;
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//System.out.println(ScannerClass.m2());
	ScannerClass.m2();
	}

}
