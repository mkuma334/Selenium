package abstraction;

public class Class_Hybrid extends AbstractClass1 implements Interface_Abstruct
{
	public void m1()
	{
		System.out.println("m1 method in Abstract class is executed");
	}
 public void m4() {
	 System.out.println("m4 method in inheritance_abstract is executed ");
 }
 
 public void m5()
 {
	 System.out.println("m5 metyhod in AbstactClass1 is executted");
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class_Hybrid x=new Class_Hybrid();
		/*
		 * x.m1(); x.m4(); x.m5();
		 */
		x.m5();
	}

}
