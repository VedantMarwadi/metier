import java.util.*;
class string3
{
	public static void main(String arg[])
	{


		String s1="Hello";//String Literal
		String s2="Hello";//String Literal
		String s3="hello";//String Literal
		String s6=("Hello");//String Literal
		String s4=new String("Hello");//by using new keyword
		String s5=new String("Hello");//by using new keyword
		/*if(s5==s4)
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");
		if(s5.equals(s4))
				System.out.println("both are equal");
		else
				System.out.println("both are not equal");*/
		/*if(s1==s6)
				System.out.println("both are equal");
		else
				System.out.println("both are not equal");
		if(s1.equals(s6))
				System.out.println("both are equal");
		else
				System.out.println("both are not equal");*/

		if(s1==s4)
				System.out.println("both are equal");
		else
				System.out.println("both are not equal");
		if(s1.equals(s4))
				System.out.println("both are equal");
		else
				System.out.println("both are not equal");

			Scanner s=new Scanner(System.in);
			System.out.println("Enter arithmeic operation that you want to perform");
			String op=s.next();
			if(op.equals("Addition"))
					System.out.println("Addition");
	}
}