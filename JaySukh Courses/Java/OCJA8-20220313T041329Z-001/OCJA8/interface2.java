interface test
{
	String toString();
}
interface test1
{
	String toString();
}
abstract class A
{
	public abstract void show();
	//public A(int i){}

}

class interface2
{
	public static void main(String arg[])
	{
		int a=34;
		System.out.println
		(
			new test()
			{
				public String toString()
				{
						System.out.println(a);
						return "test";
				}

			}

		);
		test1 t1=new test1()
		{
				public String toString()
				{
						return "test1";
				}

		};
		System.out.println(t1.toString());
		System.out.println(t1);
		System.out.println
		(
			new test1()
			{
				public String toString()
				{
						return "test";
				}
			}.toString()
		);

		A a1=new A()
		{
			public void show()
			{
				System.out.println("child class"+a);
			}
		};
		//a1.disp();
		a1.show();






	}

}