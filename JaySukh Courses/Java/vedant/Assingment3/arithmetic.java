package pack11;
import java.util.*;
public class arithmetic
{
		int no;
		protected void getvalues()
		{
				Scanner s=new Scanner(System.in);
				System.out.println("Enter any number");
				no=s.nextInt();
	    }
	    protected void printtable()
	    {
			for(int i=1;i<=10;i++)
			{
				System.out.println(no +" * "+i+" = "+(no*i));
			}
		}
}
