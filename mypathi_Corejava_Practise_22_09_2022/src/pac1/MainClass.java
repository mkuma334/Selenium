package pac1;

import java.util.Scanner;


public class MainClass extends StudentPercentage  {

	
		public static void main(String [] args) 
		{
			boolean p1=true;
			
			Scanner s=new Scanner(System.in);
			
				System.out.println("Enter the student name");
				String stuName=s.nextLine();
				
				System.out.println("Enter the student roll no");
				
				String rollNo=s.nextLine();
				
				System.out.println("Enter the student branch");
				
				String branch=s.nextLine();
				
				//System.out.println("enter the total six subjects marks");
				
				System.out.println("enter the telughu marks");
				
				int s1Telughu=s.nextInt();
				
				System.out.println("enter the English marks");
				
				int s2English=s.nextInt();
				
				System.out.println("Enter the Hindhi Marks");
				
				int s3Hindhi=s.nextInt();
				
				System.out.println("Enter the MAths Marks");
				
				int s4Maths=s.nextInt();
				
				System.out.println("Enter the Science marks");
				
				int s5Science=s.nextInt();
				
				System.out.println("enter the social marks");
				
				int s6Social=s.nextInt();
				
				System.out.println("Enter the Biology marks");
				
				int s6Biology=s.nextInt();
				
				if((s1Telughu>=0 && s1Telughu<=100) && (s2English>=0 && s2English<=100) && (s3Hindhi>=0 && s3Hindhi<=100) &&
				(s4Maths>=0 && s4Maths<=100) && (s5Science>=0&& s5Science<=100) && (s6Biology>=0 && s6Biology<=100))
				{
					 p1=false;
					 System.out.println("condition in parent if false");
					
					if((s1Telughu>=0 && s1Telughu<=35) && (s2English>=0 && s2English<=35) && (s3Hindhi>=0 && s3Hindhi<=35) &&
							(s4Maths>=0 && s4Maths<=35) && (s5Science>=0&& s5Science<=35) && (s6Biology>=0 && s6Biology<=35))
					{
						 p1=true;
						 System.out.println("conditon is child if is true");
						
					}//end of simple if
					
				}// end of paren tif
				else
				{
					System.out.println("invalid marks");
				}
				
				int totMarks=s1Telughu + s2English+s3Hindhi+s4Maths+s5Science+s6Biology;
				
				Percantage p=new Percantage();
				float actualPer=p.calculate(totMarks);
				
				System.out.println("actual percentage is actualPer" + actualPer);
				
				StudentPercentage sp=new StudentPercentage();
				
		       sp.Caculate1(actualPer, p1);
				
				
				
				
				
			
			
		
		}
	
}

