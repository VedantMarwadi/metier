import java.util.*;
class passworllengthexception extends Exception
{
	String pass;
	passworllengthexception(String pass)
	{
		this.pass=pass;
	}
	public String toString()
	{
		return "Password must be minimum 8 chars long so passworllengthexception exception generated "+pass;
	}
}
class numericpassexception extends Exception
{
	String pass;
	numericpassexception(String pass)
	{
		this.pass=pass;
	}
	public String toString()
	{
		return "Password contains numberic value so numericpassexception exception generated "+pass;
	}
}


class ten
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter user name");
		String uname=s.next();
		System.out.println("Enter Password");
		String pass=s.next();
		try
		{
			if(pass.length()<8)
			{
				throw new passworllengthexception(pass);
			}
			else
			{
				int i;
				for(i=0;i<pass.length();i++)
				{
					if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
					{
						throw new  numericpassexception(pass);
					}
				}
				System.out.println("User name "+uname);
				System.out.println("Password "+pass);
			}
		}
		catch(passworllengthexception e)
		{
			System.out.println(e);
		}
		catch(numericpassexception e)
		{
					System.out.println(e);
		}


	}
}