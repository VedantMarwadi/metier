import java.util.*;
class five
{

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int no=s.nextInt();
		if(no%2==0)
			System.out.println("it is an even number");
		else
			System.out.println("it is an odd number");

	}
}