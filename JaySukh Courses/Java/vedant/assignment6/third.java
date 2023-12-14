import java.util.*;
class array3
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
	void printoddeven()
	{
		int i;
		System.out.println("Even numbers");
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("odd numbers");
		for(i=0;i<a.length;i++)
		{
					if(a[i]%2!=0)
						System.out.println(a[i]);
		}

	}

}
class third
{
	public static void main(String arg[])
	{
		array3 a3=new array3();
		a3.getvalues();
		a3.printoddeven();

	}
}