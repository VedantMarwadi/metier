

import java.util.*;
class if6
{
	int no;
	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no");
		no=s.nextInt();
	}
	void fibbonacci()
	{
		int i=-1,j=1,k;
		int temp;

		for(temp=1;temp<=no;temp++)
		{
			k=i+j;
			System.out.print(k+"\t");
			i=j;
			j=k;


		}
		System.out.println();
	}
	void multiplication()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(no+ " * "+i+" = "+(no*i));
		}
	}
	long factorial()
	{
		long i,fact=1;
		for(i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		return fact;

	}
	int posnegzero()
	{
		if(no>0)
			return 1;
		else if(no<0)
			return -1;
		else
			return 0;

	}
	public static void main(String arg[])
	{
		if6 i1=new if6();
		i1.getdata();
		i1.fibbonacci();
		i1.multiplication();
		long r=i1.factorial();
		System.out.println("factorial is "+r);
		r=i1.posnegzero();
		if(r==1)
			System.out.println("It is positive no");
		else if(r==-1)
			System.out.println("It is negative no");
		else
			System.out.println("It is zero");


		if6 i2=new if6();
		i2.getdata();
		i2.fibbonacci();
		i2.multiplication();
		r=i2.factorial();
		System.out.println("factorial is "+r);
		r=i2.posnegzero();
		if(r==1)
			System.out.println("It is positive no");
		else if(r==-1)
			System.out.println("It is negative no");
		else
			System.out.println("It is zero");




	}
}
/*i	j	k
1	0	1
0	1	1
1	1	2
1	2	3*/