//labeled break
class break2
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
			int i=1,j;
			out:
			do
			{
				j=1;
				in:do
				{
					System.out.println(j+" ");
					if(i==j)
						break out;
					System.out.print("Hello");
					j++;
				}while(j<=5);
				System.out.println();
				i++;
			}while(i<=5);

	}
	public static void main(String arg[])
	{
		break2 b1=new break2();
		b1.fun1();
		System.out.println("second function");
		b1.fun2();
		System.out.println("third function");
		b1.fun3();

	}
}