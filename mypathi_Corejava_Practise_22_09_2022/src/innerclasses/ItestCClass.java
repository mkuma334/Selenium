package innerclasses;

public class ItestCClass 
{
	public static ITest2 f1()
	{
		class ImpClass1 implements ITest2
		{
			public void f1(int x)
			{
				System.out.println("x value in ITest2 is implemented" + x);
			}
		}
		
		ImpClass1 x=new ImpClass1();
		
		return x;
	}

	
	public static ITest3 f2()
	{
		class ImpClass2 implements ITest3
		{
		public	void f2 (int y)
			{
				System.out.println("f2 method in ITest3 implemted " + y);
			}
		}
		
		ImpClass2 y=new ImpClass2();
		
		return y;
	}
	
	
	public static void main(String[] args)
	{
		ITest2 obj1=ItestCClass.f1();
		
		obj1.f1(10);
		
		ITest3 obj2=ItestCClass.f2();
		
		obj2.f2(20);
	}
}
