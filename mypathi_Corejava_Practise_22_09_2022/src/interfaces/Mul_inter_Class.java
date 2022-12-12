package interfaces;

public class Mul_inter_Class implements Mul_inter_1,Mul_inter_2
{
	public void m1()
	{
		System.out.println("the value of a is " +Mul_inter_1.a);
	}
	
	public void m2()
	{
		System.out.println("the value of a is " + Mul_inter_2.a);
	}
	
//	public void m1()
//	{
//		System.out.println("the value of a is " + Mul_inter_1.a);
//	}
	
	public void m3()
	{
		System.out.println("the value of a is " +Mul_inter_2 .a );
	}
	
	public static void main(String[] args)
	{
		Mul_inter_Class obj=new Mul_inter_Class();
		//System.out.println(obj.a);
		
		obj.m1();
	}

}
