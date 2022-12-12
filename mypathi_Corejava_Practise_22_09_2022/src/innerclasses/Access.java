package innerclasses;
import innerclasses.*;
public class Access 
{
	public static Itest x1;
	public static Itest getx()
	{
		
		 class ImpClass implements Itest
		{
			//ImpClass x;
			public void m1(int x)
			{
				x=10;
				System.out.println("  manoj is succesfyully is implemented " +   x);
			}
			public void m2()
			{
			ImpClass  x=new ImpClass();
			}
			
		}
		 
		ImpClass   x=new ImpClass();
		 return x;
	}






}