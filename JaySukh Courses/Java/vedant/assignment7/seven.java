import java.sql.*;

class seven
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

		}
		catch(ClassNotFoundException e )
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("ClassNotFoundException Generated");
		}




	}
}