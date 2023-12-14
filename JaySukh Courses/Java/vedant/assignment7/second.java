import java.util.*;
class second
{
	public static void main(String arg[])
	{
		Scanner s=null;
		System.out.println("Enter int value");
		try
		{
			int a=s.nextInt();
			System.out.println(a);
		}
		catch(NullPointerException e)
		{
			System.out.println("You have not created scaner object");
			System.out.println(e);
		}

	}
}