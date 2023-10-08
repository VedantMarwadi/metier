//exeption rethrowing
class finally1
{
	static void karthikdemo()
	{
		int a=10;
		int b=0;
		int c;
		try
		{
			c=a/b;
			System.out.println(c);

		}
		catch(ArithmeticException e)
		{
			System.out.println("CAUGHT INSIDE THE KARTHIKDEMO "+e);
			c=a/b;
			System.out.println(c);
			//throw new ArithmeticException();
		}
		catch(Exception e)
		{
			System.out.println("CAUGHT INSIDE THE KARTHIKDEMO "+e);

		}
		finally
		{
			System.out.println("It must be executed");

		}
	}

public static void main(String ar[])
{
		try
		{
			karthikdemo();
		}
		catch(ArithmeticException e)
		{
			System.out.println("RECAUGHT "+e);
		}
		System.out.println("hello");
}
}
