import java.util.*;
class eight
{

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Year");
		int year=s.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.println("It is a leap year");
		else
			System.out.println("It is not a leap year");

	}
}