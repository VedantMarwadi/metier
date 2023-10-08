import java.util.*;
class second
{
	String firstname;
	String lastname;
	int age;
	second()
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter First Name");
			firstname=s.next();
			System.out.println("Enter Last Name");
			lastname=s.next();
			System.out.println("Enter Age");
			age=s.nextInt();
		}
	void display()
	{
		System.out.println("First Name	:"+firstname);
		System.out.println("Last Name	:"+lastname);
		System.out.println("Age		:"+age);
	}
	public static void main(String arg[])
	{
			second s1=new second();
			s1.display();
	}
}