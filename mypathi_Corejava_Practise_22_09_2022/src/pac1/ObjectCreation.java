package pac1;

public class ObjectCreation 
{  
	int a;
	 ObjectCreation x =new ObjectCreation();
	 
		// TODO Auto-generated constructor stub
	public void m3()
	{
		System.out.println("m3 is execited");
	}
	
	public static void  m1()
	{
		System.out.println("m1 is executed");
		//ObjectCreation x =new ObjectCreation();
		
		//x.m3();
		/*
		 * ObjectCreation c=new ObjectCreation(); c.m3();
		 */
		 
		
	}
	//ObjectCreation0 x =new ObjectCreation0();
	//ObjectCreation x1 =new ObjectCreation();
	
	  public static void main(String[] args) { 
		 ObjectCreation.m1();
		 System.out.println("hello");
		 new ObjectCreation().m1();;
	//	 x1.m3();
	  }
	 
	 
}
