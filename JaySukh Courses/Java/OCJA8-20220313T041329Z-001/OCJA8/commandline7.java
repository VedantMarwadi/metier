//take filename from commandline and print it's contents
import java.io.*;
class commandline7
{
	public static void main(String arg[])throws Exception
	{
		File f=new File(arg[0]);
		System.out.println("File size "+f.length());
		BufferedReader br=new BufferedReader(new FileReader(f));
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		br.close();


	}
}