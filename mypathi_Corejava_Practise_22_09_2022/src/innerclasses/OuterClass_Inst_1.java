package innerclasses;
import innerclasses.*;
public class OuterClass_Inst_1 {

	//Access x=new Access();
	
	
	public static Itest x1;
	
	//OuterClass_Inst_1. x1  =Access.getx();
	//OuterClass_Inst x1=new OuterClass_Inst();
   
	public void m1()
	{
		
	 System.out.println("m1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OuterClass_Inst_1. x1  =Access.getx();
		OuterClass_Inst_1. x1  =Access.getx();
		x1.m1(20);
		
		
	}

}
