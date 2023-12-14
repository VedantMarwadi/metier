class ex3
{
	public static void main(String arg[])
	{
		int a[]={10,20,30};
		try
		{
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)//Exception e for generic catch
		{
			System.out.println(e);
		}
		System.out.println("hello");
		System.out.println("hi");
		System.out.println("how r you");
	}
}

