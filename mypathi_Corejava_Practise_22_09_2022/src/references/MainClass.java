package references;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addres a=new Addres();
		
		Contact c=new Contact();
		
		Student s=new Student(a,c);
		//Student s=new Student();
		
		Scanner s1=new Scanner(System.in);
		
		Read1 x=new Read1();
		x.read(s1);
		
		
		
		//Display d=new Display(s);
		x.x();
		
		/*
		 * enter the name mn enter the age 56 enter the pincode 52 enter the area ll
		 * enter the mail mm enter the phn number 523 name is modified mn age is
		 * modified 56 student area is ll student p number is 52 mail is mm id is 523
		 */
	}

}
