import java.util.*;
class array6
{
	String fruits[]=new String[5];
	void getvalues()
	{
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Five Fruits Names");
		for(i=0;i<fruits.length;i++)
		{
			fruits[i]=s.next();
		}
	}
	void printascdesc()
	{
		System.out.println("Assending order");
		int i,j;
		String temp;
		for(i=0;i<fruits.length;i++)
		{
			for(j=i+1;j<fruits.length;j++)
			{
					if(fruits[i].compareTo(fruits[j])>0)
					{
						temp=fruits[i];
						fruits[i]=fruits[j];
						fruits[j]=temp;
					}
			}
		}
		for(i=0;i<fruits.length;i++)
		{
			System.out.print(fruits[i]+"\t");
		}
		System.out.println("\nDessending order");

				for(i=0;i<fruits.length;i++)
				{
					for(j=i+1;j<fruits.length;j++)
					{
							if(fruits[i].compareTo(fruits[j])<0)
							{
								temp=fruits[i];
								fruits[i]=fruits[j];
								fruits[j]=temp;
							}
					}
				}
				for(i=0;i<fruits.length;i++)
				{
					System.out.print(fruits[i]+"\t");
				}

	}

}
class six
{
	public static void main(String arg[])
	{
		array6 a6=new array6();
		a6.getvalues();
		a6.printascdesc();

	}
}