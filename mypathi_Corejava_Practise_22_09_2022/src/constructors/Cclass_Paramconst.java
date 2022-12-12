package constructors;

public class Cclass_Paramconst extends PClass_Paramconst{

	public Cclass_Paramconst(String name1) {
		// TODO Auto-generated constructor stub
		super(name1);
		System.out.println("child class constructor parameterized");
		
	}
	
	public static void main(String[] args)
	{
		Cclass_Paramconst c=new Cclass_Paramconst("manoj");
	}
}
