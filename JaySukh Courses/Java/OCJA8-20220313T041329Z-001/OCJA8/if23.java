//to do the sum of digit of a give no
import java.util.*;
class if23
{
	int no;
	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no");
		no=s.nextInt();
	}
	int sumofdigit()
	{
		int rem,sum=0,temp;
		temp=no;
		while(temp!=0)
		{
				rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
		}
		return sum;
	}
	public static void main(String arg[])
	{
		int s;
		if23 i1=new if23();
		i1.getdata();
		s=i1.sumofdigit();
		System.out.println("The sum of digit is "+s);

		if23 i2=new if23();
		i2.getdata();
		s=i2.sumofdigit();
		System.out.println("The sum of digit is "+s);





	}
}