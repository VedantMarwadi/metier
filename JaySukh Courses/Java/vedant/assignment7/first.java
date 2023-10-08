import java.util.*;
class first
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two int values");
		int a=s.nextInt();
		int b=s.nextInt();
		try
		{
			int c=a/b;
			System.out.println("The division of two value is "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter second value other than 0");
			System.out.println(e);
		}

	}
}