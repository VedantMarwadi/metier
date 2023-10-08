import java.util.*;
class seven
{

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three int numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int max;
		if(a>=b && a>=c)
			max=a;
		else if(b>=a && b>=c)
			max=b;
		else
			max=c;
		System.out.println("The maximum is "+max);

	}
}