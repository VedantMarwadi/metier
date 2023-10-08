package pack1;
public class factorial
{
		public long findfactorial(int no)
		{
				int i;
				long fact=1;
				for(i=1;i<=no;i++)
				{
					fact=fact*i;
				}
				return fact;
			}

}