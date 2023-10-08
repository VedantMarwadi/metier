//take names of student from commandline arguments and sort them alphabetically
//selection sort
class commandline4
{
	public static void main(String arg[])
	{
			int i,j;
			String temp;
			for(i=0;i<arg.length;i++)
			{
					for(j=i+1;j<arg.length;j++)
					{
						if(arg[i].compareTo(arg[j])>=0)
						{
							temp=arg[i];
							arg[i]=arg[j];
							arg[j]=temp;
						}
					}
			}
			for(String s:arg)
			{
				System.out.println(s);
			}


	}
}