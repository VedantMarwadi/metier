import java.util.*;
abstract class arithmetic
{
		public abstract void addition(int a,int b);
		public abstract void subtraction(int a,int b);
		public abstract void multiplication(int a,int b);
		public abstract void division(int a,int b);


}
class testarithmetic extends arithmetic
{
		public void addition(int a,int b)
		{
			System.out.println("Addition is "+(a+b));
		}

		public void subtraction(int a,int b)
		{
			System.out.println("Subtraction is "+(a-b));
		}
		public void multiplication(int a,int b)
		{
			System.out.println("Multiplication is "+(a*b));
		}
		public void division(int a,int b)
		{
			System.out.println("Division is "+(a/b));
		}


}



class fourteen
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two int values");
		int a=s.nextInt();
		int b=s.nextInt();
		testarithmetic t1=new testarithmetic();
		t1.addition(a,b);
		t1.subtraction(a,b);
		t1.multiplication(a,b);
		t1.division(a,b);
	}
}