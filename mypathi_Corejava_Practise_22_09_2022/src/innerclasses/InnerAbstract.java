package innerclasses;

public class InnerAbstract {

	public  abstract static class Aclass1
	{
		public  abstract void m1(int x);
		
		public void m2(int y)
		{
			System.out.println("static abstract concreate method is " + y);
		}
	}
	
	public abstract class Aclass2
	{
		public abstract void m3(int z);
		
		public static void m4(int A)
		{
			System.out.println("Instance abstract class static method m4" + A);
		}
	}
}
