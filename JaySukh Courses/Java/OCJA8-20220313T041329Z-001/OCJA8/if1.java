//to check the given no is odd or even
import java.util.*;
class if1
{
	public static void main(String []arg)
	{
		int no;
		//java.util.Scanner s=new java.util.Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no");
		no=s.nextInt();
		if(no%2==0)
		{
			System.out.println("It is even");
		}
		else
		{
			System.out.println("it is odd");
		}

	}
}