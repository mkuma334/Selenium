package innerclasses;

public interface ITest1 {

	public  static class InnerClass
	{
		public void m1(int y)
		{
			System.out.println(y+" in int");
		}
		
		public static void m2(int z)
		{
			System.out.println(z + "in int");
		}
	}
}
