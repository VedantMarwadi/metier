//to check the given no is odd or even
import java.util.*;
class if22
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
	public static void main(String arg[])
	{
		if22 i1=new if22();
		i1.getdata();
		boolean b=i1.isoddeven();
		if(b)
			System.out.println("The no is even");
		else
			System.out.println("The no is odd");


		if22 i2=new if22();
		i2.getdata();

		if(i2.isoddeven())
				System.out.println("The no is even");
		else
				System.out.println("The no is odd");



	}
}