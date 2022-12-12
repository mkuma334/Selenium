package innerclasses;

public abstract class OuterClass {

	public static class SubClass2{
		public static void m2(int x) 
		{
		System.out.println("m2");
		
		
		}
		}//Static member InnerClass
		//OuterInterface
	
	
	
	  public  class InnerClass { 
		  public static  void m1() 
		  { 
			  System.out.println("m1");
	      }
	                                 
	  
	  public void m2() 
	  { System.out.println("m2"); 
	  }
	  
       }
	  
	  //---------------------------------------
	  
	  public class InnerClass2 
	  {
		  public void m3() 
		  {
	  System.out.println("m3 is executed"); 
	  }
	  
	  public void m4() 
	  { 
		  System.out.println("m4 is executed"); 
	  }
	  
	  
	  }
	  
}
	/*public class SubClass22{
		public static void m22(int y) {
		System.out.println("m22");
		System.out.println("hu");
		}
		}//Instance member InnerClass
		public static class SubClass33{
		public static  void m33(int z) {
		System.out.println("hi");

		System.out.println("yell");
		}
		}//Static member InnerClass
		}//OuterAbstractClass
*/
