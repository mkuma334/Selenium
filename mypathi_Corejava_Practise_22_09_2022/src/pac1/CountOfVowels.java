package pac1;

import java.util.Scanner;

public class CountOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		
		String vowel=s.nextLine();
		
		
		for(int i=0;i<=vowel.length()-1;i++)
		{
			char c= vowel.charAt(i);
			switch (c) {
			
			case '7':count++;
			
			case '-': count++;
			
			System.out.println("print A");
			break;
				
			case '9': count++;
			
			case '/': count++;
			
			System.out.println("print E");
			
			case '.':count++;
			
			case '6':count++;
			System.out.println("print I");
			
			case '5':count++;
			
			case '4':count++;
			
			System.out.println("O");
			
			
			case '3':count++;
			System.out.println("print 3");
			case '8':count++;
			System.out.println("print 8");
				
				
				default:
					break;
			
			}
			//System.out.println(count);
		}
		System.out.println(count);
		s.close();
		
		System.out.println("--------------------------------------------------------------------");
		
		if(vowel.equals("7"))
		{
			System.out.println("7 is executed in if block");
			
			System.out.println("hi");
			
		}
		else if(vowel.equals("8"))
		{
			System.out.println("8 is executed");
			
		}
		else
		{
			System.out.println("no one is executed");
		}

	}

}
