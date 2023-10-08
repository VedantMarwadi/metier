import java.util.*;
class array1
{
	int a[]=new int[10];
	void getvalues()
	{
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10 int values");
		for(i=0;i<a.length;i++)
		{

			a[i]=s.nextInt();
		}
	}
	int largestno()
	{
		int i;
		int max=a[0];

		for(i=1;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];

		}
		return max;

	}
	int smallestno()
	{
		int i;
		int min=a[0];
		for(i=1;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		return min;

	}
}
class first
{
	public static void main(String arg[])
	{
		array1 a1=new array1();
		a1.getvalues();
		int max=a1.largestno();
		System.out.println("The maximum value is "+max);
		int min=a1.smallestno();
		System.out.println("The minimum value is "+min);

	}
}