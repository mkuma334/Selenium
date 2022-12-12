package abstraction;

public class Cabs extends Iabst {

	public void m1()
	{
		System.out.println("m1 in itest interfac");
	}
	
	public void m2()
	{
		System.out.println("m2 method in itest interface");
	}
	
	public void m3()
	{
		System.out.println("m3 method in abstract");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Cabs x=new Cabs();
   x.m1();
   x.m2();
   x.m3();
	}

}
