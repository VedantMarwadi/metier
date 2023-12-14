import java.util.*;
class six
{

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any alphabet");
		String str=s.next();
		char ch=str.charAt(0);
		switch(ch)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':System.out.println("It is vowel");
						break;
			default:
						System.out.println("It is consonant");
		}
	}
}