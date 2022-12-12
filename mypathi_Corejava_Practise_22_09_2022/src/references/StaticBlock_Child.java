package references;
import references.*;
public class StaticBlock_Child extends StaticBlocks_Parent {

	static void m1(int k)
	{
		System.out.println("child class method m2" + k);
	}
	
	void m01()
	{
		System.out.println("instance method in child class ");
	}
	static 
	{
		System.out.println("child class static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //StaticBlock_Child obj=new StaticBlock_Child();
     
//		StaticBlock_Child.m1();
//		StaticBlock_Child.m2();
		
		
		StaticBlock_Child.m1(10);
		
		
		
	}

	/*
	 * output :parenclass static block
	 *  child class static block 
	 *  parentclass method
	 * m1 
	 * child class method m2 
	 * parentclass method m1 
	 * child class method m2
	 */

}
