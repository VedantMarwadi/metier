import java.util.*;
class five
{
	public static void main(String arg[])
	{
		String a[]=new String[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String values in the array");
		try
		{
			for(int i=0;i<5;i++)
			{
				a[i]=s.next();
			}
			System.out.println("Printing array elements and print 6th character of each element");
			for(int i=0;i<=5;i++)
			{
				System.out.println(a[i]);
				System.out.println("6th character of this string is "+a[i].charAt(5));
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{

				System.out.println(e);
		}
		System.out.println("ArrayIndexOutOfBoundsException program");


	}
}