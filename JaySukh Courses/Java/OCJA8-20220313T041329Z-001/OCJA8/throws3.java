//exeption rethrowing
class throws3
{
	static void karthikdemo()
	{
		try
		{
			//throw object of Throwable or subclass of Thraowable
			throw new NullPointerException("DEMO");
		}
		catch(NullPointerException e)
		{
			System.out.println("CAUGHT INSIDE THE KARTHIKDEMO "+e);
			throw e;
		}
		finally
		{
			System.out.println("It must be executed");
			throw new ArithmeticException();
		}
	}

public static void main(String ar[])
{
		try
		{
			karthikdemo();
		}
		catch(NullPointerException e)
		{
			System.out.println("RECAUGHT "+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("RECAUGHT "+e);
		}
		System.out.println("hello");
}
}
