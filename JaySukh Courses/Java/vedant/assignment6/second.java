import java.util.*;
class array2
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
	int[] copy()
	{
		int temp[]=new int[10];
		int i;
		for(i=0;i<a.length;i++)
		{
			temp[i]=a[i];
		}
		return temp;

	}

}
class second
{
	public static void main(String arg[])
	{
		array2 a2=new array2();
		a2.getvalues();
		int b[]=a2.copy();
		int i;
		System.out.println("new array with copy function");
		for(i=0;i<b.length;i++)
		{
					System.out.println(b[i]);
		}



	}
}