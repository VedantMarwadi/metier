import java.util.*;
class second
{
	int addition(int a,int b)
	{
		return a+b;
	}
	int subtraction(int a,int b)
	{
		return a-b;
	}
	int multiplication(int a,int b)
	{
		return a*b;
	}
	int division(int a,int b)
	{
		return a/b;
	}
	public static void main(String arg[])
	{
		second s1=new second();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two integer values");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter Operator(+,-,*,/)");
		String op=s.next();
		if(op.equals("+"))
			System.out.println("Addition  is "+s1.addition(a,b));
		else if(op.equals("-"))
			System.out.println("Subtraction  is "+s1.subtraction(a,b));
		else if(op.equals("*"))
			System.out.println("Multiplication  is "+s1.multiplication(a,b));
		else if(op.equals("/"))
			System.out.println("Division  is "+s1.division(a,b));
		else
				System.out.println("invalid operator try again");


	}
}