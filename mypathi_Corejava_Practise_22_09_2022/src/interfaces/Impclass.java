package interfaces;

public class Impclass implements Iinterface2 
{
	public int m1(int x,int y)
	{
		if (x>y)
		{
            System.out.println("x is greater"+x);
			return x;
			
		}
		
		else 
			{
			System.out.println("y is greater" + y);
			return y;
			}
		
	}
	
	public int m2 (int x,int y)
	{
		System.out.println("addtion of x and y is "+x+y);
		return x+y;
	 
	}
	
	/*
	 * public int m2 (int x,int y) {
	 * System.out.println("addtion of x and y is "+x+y); return x+y;
	 * 
	 * } ambiguity issue 
	 */
	
	public int m(int x,int y)
	{
		System.out.println(x-y);
		return x-y;
	}
	
	public int m4 (int x,int y)
	{
		System.out.println("multiplication of x and y is "+x*y);
		//System.out.println(Iinterface2.name);
		return x*y;
	}
	
	public void x()
	{
	  System.out.println("name in method is " + name);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Impclass x=new Impclass();
      System.out.println("given name in interface is " + Iinterface2.name);
      
      System.out.println(x.name);
      
      System.out.println("implementation class of 1 is "+  x.m4(10, 12));
      x.x();
	}

}
