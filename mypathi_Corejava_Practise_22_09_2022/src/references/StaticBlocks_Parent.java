package references;

public class StaticBlocks_Parent {

	
	 static void m1(int k)
	{
		System.out.println("parentclass method m1"+ k);
	}
	void m01()
	{
		System.out.println("instamce method in parentclass");
	}
	
	static
	{
		System.out.println("parenclass static block");
	}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * StaticBlocks_Parent.m1(); StaticBlocks_Parent.m1();
	 * 
	 * 
	 * }
	 */
}
