import java.util.*;
class ten
{

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=s.nextInt();
		int count=0,i;
		for(i=1;i<=no;i++)
		{
			if(no%i==0)
				count++;

		}
		if(count<=2)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");

	}
}