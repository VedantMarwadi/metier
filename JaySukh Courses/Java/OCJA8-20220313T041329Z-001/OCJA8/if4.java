

import java.util.*;
class if4
{
	int no;

	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no");
		no=s.nextInt();

	}
	void printprime()
	{
		int n,i,flag;
		for(n=1;n<=no;n++)
		{
			flag=0;
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(n);
		}


	}


public static void main(String jay[])
	{
		if4 i1=new if4();
		i1.getdata();
		i1.printprime();

	}
}