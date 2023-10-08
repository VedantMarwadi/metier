class commandline1
{
	public static void main(String arg[])
	{

		System.out.println("Argument Length "+arg.length);
		int i;
		for(i=0;i<arg.length;i++)
		{
			System.out.println("argument "+i+" "+arg[i]);
		}
		for(String str:arg)//for each loop or enhenced for loop
		{
			System.out.println("argument "+str);
		}
	}
}