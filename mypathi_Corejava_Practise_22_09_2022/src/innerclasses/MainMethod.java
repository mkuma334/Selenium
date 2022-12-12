package innerclasses;
//import innerclasses.*;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * OuterClass x=new OuterClass() {};
		 * 
		 * 
		 * OuterClass.InnerClass x2=new OuterClass.InnerClass(); x2.m2(); x2.m1();
		 * 
		 * 
		 * OuterClass.InnerClass2 x3=x.new InnerClass2();
		 * 
		 * x3.m3(); x3.m4();
		 */
		
		OuterClass ob = new OuterClass() {};
		
		OuterClass.SubClass2 ob1=new OuterClass.SubClass2();
		
		ob1.m2(10);
		
		OuterClass.InnerClass ob2=ob.new InnerClass();
		
		ob2.m1();
		ob2.m2();
		
		OuterClass.InnerClass2 ob3=ob.new InnerClass2();
		
		ob3.m3();
		ob3.m4();
		
		ITest1.InnerClass x=new ITest1.InnerClass();
		x.m1(30);
		x.m2(40);
		
		System.out.println("------------INNERINTERFACES IN CLASSES------------");
		
		SubClass.ITest3 obj4=new SubClass.ITest3() {
			
			@Override
			public void m1(int x) {
				// TODO Auto-generated method stub
				System.out.println("x value in innerinterfacce in class ITest3" + x);
			}
			//obj4.m1(50);
		};
		
		obj4.m1(50);
		
		
		SubClass.ITest4 ob5=(int y)->
		{
			System.out.println("y value in inner interfaces in classes of ITest4" + y);
		};
        
		ob5.m2(60);
	
//	System.out.println("------------INNER ABSTRACTION  IN CLASSES------------");
	
	InnerAbstract ob6=new InnerAbstract();
	InnerAbstract.Aclass1 g=new InnerAbstract.Aclass1() {
		
		@Override
		public void m1(int x) {
			// TODO Auto-generated method stub
			
			System.out.println("INNER STATIC ABSTRACT CLASS ABSTRACR METHOD" + x);
		}
	};
	
	    g.m1(70);
	    
	    g.m2(80);
	    
	    InnerAbstract.Aclass2 ob7=ob6.new Aclass2() {
			
			@Override
			public void m3(int z) {
				// TODO Auto-generated method stub
				System.out.println("INNER ABSTRACT NON STATIC CLASS m3 method" + z);
			}
		};
	    
		ob7.m3(90);
		
		ob7.m4(100);
	}

}
