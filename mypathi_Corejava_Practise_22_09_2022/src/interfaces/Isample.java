package interfaces;

public class Isample implements Sample {
 
    public 	void m1 (int x)
	{
		System.out.println("the value of x is " +x);
		
	}
    
    public void m2(int y)
    {
    	System.out.println("the value of y is " + y);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Isample x=new Isample();
     x.m1(10);
     x.m2(20);
	}

}
