package pack7;
import java.util.*;
public class power1
{
		public int no,pow;
		public void getvalues()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Number");
			no=s.nextInt();
			System.out.println("Enter Power");
			pow=s.nextInt();
		 }
		public void calpower()
		{
			int result=1;
			for(int i=1;i<=pow;i++)
			{
					result=result*no;
			}
			System.out.println("The power of the no is "+result);
		}


}
