package abstraction;

public class AbstractClass_Extended1 extends AbstractClass_Extended implements Interface_Abstruct {
 
	public void m4() 
	{
		System.out.println("the value of a int variable is " + a);
		
	}
	
	public static void main(String[] args)
	{
		AbstractClass_Extended1 x=new AbstractClass_Extended1();
		x.m1();
		x.m2();
		x.m3();
		x.m4();
		
	}
}
