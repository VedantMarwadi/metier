package pack9;
import java.util.*;
public class fibonacci
{

		protected void printvalues()
		{
				int no=1,i=-1,j=1,k;
				while(no<=25)
				{
					k=i+j;
					System.out.print(k+",");
					i=j;
					j=k;
					no++;
				}
	    }
}
