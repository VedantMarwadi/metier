import java.util.*;
class nine
{

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter end number to do the sum of natural number");
		int no=s.nextInt();
		int i,sum=0;
		for(i=1;i<=no;i++)
		{
			sum=sum+i;

		}
		System.out.println(" sum of natural number is "+sum);

	}
}