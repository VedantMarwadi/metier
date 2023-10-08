class A
{
	public void show()
	{
		System.out.println("A class");
	}
}
class any
{
	public static void main(String arg[])
	{
		A a1=new A();
		a1.show();
		A a2=new A()//ananoumus class
		{
			public void show()
			{
				System.out.println("B class");
			}
		};
	a2.show();
	}
}

