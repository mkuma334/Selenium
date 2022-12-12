package pac1;

import java.util.Scanner;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		//int temp=n;
		int r=0;
		while(n>0)
		{
		int c = n%10;
		r=(r*10)+c;
		n=n/10;
		}//end of loop
		System.out.print("reverse number is " +r);
	}

}
