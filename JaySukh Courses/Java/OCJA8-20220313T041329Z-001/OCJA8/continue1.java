//labeled continue
class continue1
{
	void fun1()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==6)
				continue;
			System.out.println("hello");
		}

	}
	void fun2()
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print("\n"+j+" ");
				if(i==j)
					continue;
				System.out.println("Hello ");
			}
			System.out.println();

		}
	}
	void fun3()
		{
			int i,j;
			out:for(i=1;i<=5;i++)
			{

				in:for(j=1;j<=5;j++)
				{
					System.out.print(j+" ");
					if(i==j)
						continue out;
					System.out.print("Hello ");
				}


			}
	}
	public static void main(String arg[])
	{
		continue1 b1=new continue1();
		b1.fun1();
		System.out.println("second function");
		b1.fun2();
		System.out.println("third function");
		b1.fun3();

	}
}