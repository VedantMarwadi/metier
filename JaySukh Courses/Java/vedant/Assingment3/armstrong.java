package pack13;
import java.util.*;
public class armstrong
{
		int no;
		protected void getvalues()
		{
				Scanner s=new Scanner(System.in);
				System.out.println("Enter any number");
				no=s.nextInt();
	    }
	    protected void checkarmstrong()
	    {
			int rem,sum=0,temp;
			temp=no;
			while(temp!=0)
			{
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp=temp/10;
			}
			if(sum==no)
				System.out.println("It is an armstrong number");
			else
				System.out.println("It is not an armstrong number");

		}
}
