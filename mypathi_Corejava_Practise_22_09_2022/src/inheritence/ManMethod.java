package inheritence;

import java.util.Scanner;

import inheritence.*;

public class ManMethod {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s =new Scanner(System.in);
        Student s1=new Student();
		Read r=new Read();
		
		r.read(s);
		
		//Student s1=new Student();
		
		r.getAllDetails();
	}

}
