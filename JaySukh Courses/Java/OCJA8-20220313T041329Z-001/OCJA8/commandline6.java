class commandline6
{
	public static void main(String arg[])
	{
			int i,j;
			String temp;
			int a,b;
			for(i=0;i<arg.length;i++)
			{

					for(j=i+1;j<arg.length;j++)
					{
						a=Integer.parseInt(arg[i]);
						b=Integer.parseInt(arg[j]);
						if(a>b)
						{
							temp=arg[i];
							arg[i]=arg[j];
							arg[j]=temp;
						}
					}
			}
			for(i=0;i<arg.length;i++)
			{
				System.out.println(arg[i]);
			}


	}
}