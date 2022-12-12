package interfaces;

public class Same_Method_Class implements Same_Method_interf_2 {

	public void m1() {
		System.out.println("the value of " +Same_Method_interf. a);
	}
	public void m2()
	{
		System.out.println("the value of " + a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Same_Method_Class x=new Same_Method_Class();
     x.m1();
     x.m2();
	}

}
