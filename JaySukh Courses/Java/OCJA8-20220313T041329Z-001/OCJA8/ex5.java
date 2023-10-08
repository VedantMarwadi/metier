import java.io.*;
class ex5
{
	public static void main(String arg[])
	{
		int a[]={10,20,30,40,50};
		while(true)
		{
			try
			{
				DataInputStream d=new DataInputStream(System.in);
				System.out.println("Enter array index('Enter end to exit')");
				String s=d.readLine();
				if(s.equals("end"))
					break;
				int i=Integer.parseInt(s);
				System.out.println(a[i]);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Sorry No Characters");
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Please Enter index between 0 to 4");
				System.out.println(e);
			}
			catch(Exception e)//generic catch
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("finally block");
			}
			System.out.println("It must be executed");
		}

	}
}

