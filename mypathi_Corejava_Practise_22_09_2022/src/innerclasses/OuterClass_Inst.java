package innerclasses;

public class OuterClass_Inst {

	//OuterClass_Inst obj = new OuterClass_Inst();
	public int a;
	ITest3 x;
	public static void s1()
	{
		System.out.println("s1 is executed");
	}
	
	public void s2()
	{
		System.out.println("s2 is executed");
	}
	
	class Instace_InnerClass implements ITest3
	{
		public void m1(int x)
		{
			System.out.println("ITest3 interface method implemented in Instace inner class" + x);
		}
		
		public void s3()
		{
			System.out.println("s3 method is executed");
			OuterClass_Inst.s1();
		}
	}
	OuterClass_Inst obj3 = new OuterClass_Inst();
	
	
	public static void main(String[] args)
	{
		OuterClass_Inst obj = new OuterClass_Inst();
		
		
		OuterClass_Inst.Instace_InnerClass obj1=obj.new Instace_InnerClass();
		
		obj1.m1(10);
		
		obj1.s3();
	}
	
	
}
