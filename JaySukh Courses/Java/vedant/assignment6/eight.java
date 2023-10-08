import java.util.*;
class string8
{
	String str;
	void getstring()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any string");
		str=s.nextLine();
	}
	void count()
	{
			int i,countvowel=0,countconst=0;
			for(i=0;i<str.length();i++)
			{
					if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
						countvowel++;
					else
						countconst++;
			}
			System.out.println("No of vowels are "+countvowel);
			System.out.println("No of consonans are "+countconst);
	}
}
class eight
{
	public static void main(String arg[])
	{
		string8 s1=new string8();
		s1.getstring();
		s1.count();
	}
}