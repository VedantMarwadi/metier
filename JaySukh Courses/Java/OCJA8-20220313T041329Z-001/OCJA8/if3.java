//use of do while

import java.util.*;
class if3
{
	char ch;
	String str;
	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any String");
		str=s.next();
		ch=str.charAt(0);
		ch=Character.toLowerCase(ch);
		str=str.toLowerCase();

	}
	boolean iswovel()
	{
		if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return true;
		else
			return false;
	}
	boolean iswovel2()
	{
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':return true;

			default:return false;
		}
	}
	int countwovel()
	{
		int i,c=0;
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);

			if(iswovel())
				c++;
		}
		return c;
	}
	int weekdays()
	{
		switch(str)
		{


			case "monday":return 1;
			case "tuesday":return 2;
			case "wednesday":return 3;
			case "thursday":return 4;
			case "friday":return 5;
			case "saturday":return 6;
			case "sunday":return 7;
			default:return -1;

		}
	}

public static void main(String arg[])
	{
		if3 i1=new if3();
		i1.getdata();
		boolean b=i1.iswovel();
		if(b)
				System.out.println("it is wovel");
		else
				System.out.println("it is not a wovel");

		b=i1.iswovel2();
		if(b)
				System.out.println("it is wovel");
		else
				System.out.println("it is not a wovel");
		int no=i1.weekdays();
		System.out.println("Day number is "+no);
		int c=i1.countwovel();
		System.out.println("No of wovels are "+c);
	}
}
