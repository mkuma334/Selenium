package pac1;

import java.util.Scanner;

public class Percentage_Of_Student_Marks {

	/*
	 * wap to read stuName,rollNo,branch and 6Sub Marks,and calcultae
	 * totMarks,percentage and result.
	 */
	int sixSubMarks,  totalMarks;
	String stuName, branch,rollNo1;

	double s1() {
		return 10.5;
	}

	public void m1() {
		Scanner s = new Scanner(System.in);

		System.out.println("enter the Student name");

		stuName = s.nextLine();
		System.out.println("enter the stuDent rollNo");

		//rollNo = Integer.parseInt(s.nextLine());
		
		rollNo1=s.nextLine();

		System.out.println("enter the branch");

		branch = s.nextLine();

		System.out.println("enter the six sub marks");
		

		sixSubMarks = s.nextInt();

	}

	int calculate() {
		totalMarks = sixSubMarks + 0;
		System.out.println("total marks is " + totalMarks);

		return totalMarks;
	}

	double percentage() {
		int perc = totalMarks / 6;
		float f = (float) perc; //Type casting
		System.out.println("percentage is  " + f);
		if (perc >= 60) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		return perc;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Percentage_Of_Student_Marks obj = new Percentage_Of_Student_Marks();
		obj.m1();
		obj.calculate();
		obj.percentage();

	}

}
