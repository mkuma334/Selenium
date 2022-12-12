package abstraction;

public class AbstractClass_Extended extends  AbstactClass implements Interface_Abstruct
{
	public void m1()
	{
		System.out.println("m1 abstact method is implemented using exrtended relation ship");
	}
	
	public void m3()
	{
		System.out.println("m3 method in extended class");
	}
	
	public void m4()
	{
		System.out.println("m4 method in interface is implemented");
	}

	public static void main(String[] args) {
		AbstractClass_Extended x=new  AbstractClass_Extended();
		x.m1();
		x.m2();
		x.m3();
		x.m4();
	}
}
