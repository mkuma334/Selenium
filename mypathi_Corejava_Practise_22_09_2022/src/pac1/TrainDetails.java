package pac1;

import java.util.Scanner;

public class TrainDetails {
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * wap to read and display Train details?
		 * (trainNo,trainName,fromStation,toStation,ticketPrice )
		 */
		Scanner s=new Scanner(System.in);
		System.out.println("enter the train no");
		
		int train_No=s.nextInt();
		System.out.println("enter the train name");
		
		String trainName=s.nextLine();
		
		System.out.println("enter the train  from station");
		
		String fromStation=s.nextLine();
		
		System.out.println("enter the train to station");
		
		String toStation =s.nextLine();
		System.out.println("enter the train price");
		
		float trainPrice =s.nextFloat();
		
		
		System.out.println( train_No + " " + trainName + " " + fromStation + "  "  + toStation);
		
		 
	}

}
