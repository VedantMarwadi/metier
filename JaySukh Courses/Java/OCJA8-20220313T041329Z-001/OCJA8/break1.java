//labeled break
class break1
{
	void fun1()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==6)
				break;
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
				System.out.print(j+" ");
				if(i==j)
					break;
				System.out.print("Hello ");
			}
			System.out.println();
		}
	}
	void fun3()
	{
			int i,j;
			out:
			for(i=1;i<=5;i++)
			{
				for(j=1;j<=5;j++)
			 in:{
					System.out.println(j);
					if(i==j)
						break out;
					System.out.println("Hello");
				}

			}

	}
	public static void main(String arg[])
	{
		break1 b1=new break1();
		b1.fun1();
		System.out.println("second function");
		b1.fun2();
		System.out.println("third function");
		b1.fun3();

	}
}


