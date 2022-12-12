package interfaces;

public class impclass1 implements Iinterface2
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
	
	public int m3(int x,int y)
	{
		System.out.println(x-y);
		return x-y;
	}
	
	public int m4 (int x,int y)
	{
		System.out.println("multiplication of x and y is "+x*y);
		return x*y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		impclass1 x=new impclass1();
      
      System.out.println("implementation class of 2 is "+x.m3(20, 10));
	}

}
