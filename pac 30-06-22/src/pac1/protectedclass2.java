package pac1;

 class protectedclass2 
{
	protected void m2() {
		System.out.println("protedmethod m2");
	}
	static int m  (int n,int m)
	{
		return n+m;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Protectedclass1 x=new Protectedclass1();
      x.m1();
      protectedclass2 y=new protectedclass2();
      System.out.println(y.m(10, 20));
	}

}
