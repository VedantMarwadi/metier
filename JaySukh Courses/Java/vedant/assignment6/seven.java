import java.util.*;
class seven
{
	public static void main(String arg[])
	{
		String firstname;
		String lastname;
		String fullname;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first name");
		firstname=s.next();
		System.out.println("Enter last name");
		lastname=s.next();
		fullname=firstname.concat(" ").concat(lastname);
		int length=fullname.length();
		System.out.println("concated full name is "+fullname);
		System.out.println("Length of full name is "+length);
		System.out.println("full name in uppercase "+fullname.toUpperCase());
		System.out.println("full name in uppercase "+fullname.toLowerCase());

	}
}