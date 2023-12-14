//<< -- USER DEFINED EXCEPTION -->
//nonegative value exception
import java.io.*;
class nonegativeexe extends RuntimeException
{
    //private int a;
    nonegativeexe(String msg)
    {
    	super(msg);
    }
	/*public String toString()
	{
		return "nonegativeexe generated for value["+a+"]";
	}*/
}
class throws5
{
	public int x;
	void getInt()//throws nonegativeexe
    {
    	try
        {
        	BufferedReader dis= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter any no");
			String line=dis.readLine();
        	x=Integer.parseInt(line);
        	if(x<0)
        	{
        		System.out.println("it will genetrate an exception");
				throw new nonegativeexe("negative value is not allowed");
        	}
		   	else
		   	{
				System.out.println("VALID NO");
			}

        }
        catch(nonegativeexe m)
        {
        	System.out.println(m);
        	System.out.println(m.getMessage());

        }
        catch(NumberFormatException n)
       	{
        	System.out.println("SORRY !! NO CHARACTERS");
        	System.out.println("EXCITING......");
        	System.out.println("GENERATE EXCEPTION "+n);
        }
        catch(IOException e)
        {
		}
        System.out.println("Hello");
	}

	public static void main(String ar[])//throws nonegativeexe
	{
		throws5 usr=new throws5();
		usr.getInt();
	}
}
