import java.io.*;
class student
{
	void getdata()
	{
		System.out.println("Hello");
	}
}
class ex6
{
	public static void main(String arg[])
	{
		try
		{
			student s[]=new student[5];
			for(int i=0;i<s.length;i++)
			{
				s[i]=new student();
				s[i].getdata();
			}
			InputStream i1=null;
			int sa=i1.available();
		}


		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hi");
		System.out.println("Hello");


	}
}

