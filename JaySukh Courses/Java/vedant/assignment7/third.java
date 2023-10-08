import java.io.*;
class third
{
	public static void main(String arg[])
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter two int values");
		try
		{
			int a=Integer.parseInt(d.readLine());
			int b=Integer.parseInt(d.readLine());
			int c=a+b;
			System.out.println(c);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Sorry No Characters");
			System.out.println(e);
		}
		catch(IOException e)
		{
				System.out.println(e);
		}

	}
}