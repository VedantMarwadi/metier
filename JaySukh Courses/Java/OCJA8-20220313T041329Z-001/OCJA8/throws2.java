//<-- EXAMPLE ON  THROWS -->
class throws2
{
	void get()//throws Exception
	{
		System.out.println("INSIDE get");
		int k=0;
		int k1=40/k;
		System.out.println("THE STATEMENT IS NOT PRINTED");
		//try
		//{
			//throw new Exception();
		//}
		//catch(Exception e)
		//{
		//	System.out.println("get "+e);
		//}
	}
	public static void main(String args[])//throws Exception
	{
		throws2 t1=new throws2();
		try
		{
			t1.get();
		}
		catch(Exception e)
		{
			System.out.println("main "+e);
		}
		System.out.println("Hello");
	}
}
