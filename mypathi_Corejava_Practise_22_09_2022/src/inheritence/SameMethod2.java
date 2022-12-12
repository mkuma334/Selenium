package inheritence;

public class SameMethod2 extends SameMethod1{

	public void m1()
	{
		System.out.println("m1 method in childclass");
	}
	
	public void m2()
	{
		System.out.println("m2 method in child class");
	}
	
	public static void main(String[] args)
	{
		SameMethod1 x=new SameMethod1();
		x.m1();
	}
}
