import java.util.*;
class array4
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
	void printreverse()
	{
		int i;
		System.out.println("array element in reverse order");
		for(i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
class four
{
	public static void main(String arg[])
	{
		array4 a4=new array4();
		a4.getvalues();
		a4.printreverse();

	}
}