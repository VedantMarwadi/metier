import java.io.*;

class eight
{
	public static void main(String arg[])
	{
		try
		{
			FileReader f1 =new FileReader("first.txt");
			System.out.println("File Data is "+f1.read());
		}
		catch(FileNotFoundException e )
		{
			System.out.println(e);
		}
		catch(IOException e )
		{
					System.out.println(e);
		}
		finally
		{
			System.out.println("FileNotFoundException Generated");
		}




	}
}