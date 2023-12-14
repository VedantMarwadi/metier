import java.util.*;
class four
{
	public static void main(String arg[])
	{
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter values in the array");
		try
		{
			for(int i=0;i<5;i++)
			{
				a[i]=s.nextInt();
			}
			System.out.println("Printing array elements");
			for(int i=0;i<=5;i++)
			{
					System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{

				System.out.println(e);
		}
		System.out.println("ArrayIndexOutOfBoundsException program");


	}
}