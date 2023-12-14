import java.util.*;
class calculator
{
	int a,b;
	void getinput()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two Integer values");
		a=s.nextInt();
		b=s.nextInt();
	}
	int addition()
	{
		int r;
		r=a+b;
		return r;
	}
	int subtraction()
	{
		return (a-b);
	}
	int multiplication()
	{
			return (a*b);
	}
	int division()
	{
			return (a/b);
	}
	int modulus()
	{
			return (a%b);
	}
	public static void main(String arg[])
	{
		calculator c1=new calculator();
		c1.getinput();

		int r;
		r=c1.addition();
		System.out.println("Addition is "+r);
		r=c1.subtraction();
		System.out.println("Subtraction is "+r);
		r=c1.multiplication();
		System.out.println("Multiplication is "+r);
		r=c1.division();
		System.out.println("Division is "+r);
		r=c1.modulus();
		System.out.println("Modulus is "+r);


	}
}