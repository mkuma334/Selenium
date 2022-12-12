package interfaces;

public class MethodCalling {

	 public void m1()
	 {
		 System.out.println("m1 is executed");
	 }
	 
	 public void m2()
	 {
		 this.m1();
		 System.out.println("m2 method is executed");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  MethodCalling x=new MethodCalling();
  x.m2();
	}

}
