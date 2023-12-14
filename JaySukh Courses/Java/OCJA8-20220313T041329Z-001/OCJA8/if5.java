import java.util.*;
class if5
{
	int no;
	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no");
		no=s.nextInt();
	}
	void multable()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(no+" * "+i+" = "+(no*i));
		}

	}
	void natural()
	{

		int i;
		for(i=1;i<=no;i++)
		{
				System.out.print(i+"\t");
		}


	}
	public static void main(String arg[])
	{
		if5 i1=new if5();
		i1.getdata();
		i1.multable();
		i1.natural();
	}
}