package pac1;

public class SampleClass1 {

	static int a=10;
	static int b=11;
	
	 static void m1()
	 {
		 System.out.println(a);
	 }
	 
	 static void m2()
	 {
		 m1();
	 
		 System.err.println(b);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleClass1.m2(); 

}
}
