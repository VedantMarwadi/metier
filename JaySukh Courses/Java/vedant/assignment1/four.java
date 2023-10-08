import java.util.*;
class four
{
	void swap()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two int  values to swap");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Values before swap a ="+a+" and b ="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Values after swap a ="+a+" and b ="+b);

	}
	public static void main(String arg[])
	{
		four f1=new four();
		f1.swap();


	}
}