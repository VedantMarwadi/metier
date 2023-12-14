
import java.util.*;
class if2
{
	int no;

	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no");
		no=s.nextInt();
	}
	boolean isoddeven()
	{
		if(no%2==0)
			return true;
		else
			return false;
	}
	void isoddeven2()
	{
		if(no%2==0)
			System.out.println("It is even");
		else
			System.out.println("It is odd");
	}
	boolean isprime()
	{
		int i;
		boolean flag=false;

		for(i=2;i<no;i++)
		{
				if(no%i==0)
				{
					flag=true;
					break;
				}

		}
		if(flag)
			return false;
		else
			return true;
	}
	boolean isprime2()
	{
			int i,c=0;
			for(i=1;i<=no;i++)
			{
					if(no%i==0)
					{
						c++;

					}

			}
			if(c<=2)
				return true;
			else
				return false;
	}
	int sumofdigit()
	{
		int rem,sum=0,temp;
		temp=no;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+rem;
			//System.out.print(rem);
			temp=temp/10;
		}
		return sum;
	}
	boolean isarmstrong()
	{
			int rem,sum=0,temp;
			temp=no;
			while(temp!=0)
			{
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp=temp/10;
			}
			if(sum==no)
					return true;
			else
					return false;
	}
	boolean ispalle()
	{
				int rem,revno=0,temp;
				temp=no;
				while(temp!=0)
				{
					rem=temp%10;
					revno=(revno*10)+rem;
					temp=temp/10;
				}
				if(revno==no)
						return true;
				else
						return false;
	}
	public static void main(String arg[])
	{
		if2 i1=new if2();
		i1.getdata();
		boolean b=i1.isoddeven();
		if(b)
			System.out.println("The no is even");
		else
			System.out.println("The no is odd");

		b=i1.isprime();
		if(b)
			System.out.println("It is prime");
		else
			System.out.println("It is not prime");

		b=i1.isprime2();
		if(b)
			System.out.println("It is prime");
		else
			System.out.println("It is not prime");

		b=i1.isarmstrong();
		if(b)
			System.out.println("It is armstrong no");
		else
			System.out.println("It is not an armstrong no");

		b=i1.ispalle();
		if(b)
			System.out.println("It is pallendrome no");
		else
			System.out.println("It is not pallendrome no");

		int sum=i1.sumofdigit();
		System.out.println("The sum of digit is "+sum);
		i1.isoddeven2();

		if2 i2=new if2();
		i2.getdata();
		b=i2.isoddeven();
		if(b)
				System.out.println("The no is even");
		else
				System.out.println("The no is odd");


		b=i2.isprime();
		if(b)
				System.out.println("It is prime");
		else
				System.out.println("It is not prime");

		b=i2.isarmstrong();
		if(b)
			System.out.println("It is armstrong no");
		else
			System.out.println("It is not an armstrong no");

		b=i2.ispalle();
		if(b)
			System.out.println("It is pallendrome no");
		else
			System.out.println("It is not pallendrome no");

		sum=i2.sumofdigit();
		System.out.println("The sum of digit is "+sum);

		i2.isoddeven2();



	}
}

