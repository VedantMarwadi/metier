class FinalizeExample
{
	public void finalize()//overides the object class finalize method//public or protected
	{
		System.out.println("finalize called");
	}
	public static void main(String[] args)
	{
		FinalizeExample f1=new FinalizeExample();
		FinalizeExample f2=new FinalizeExample();
		f1=null;
		f2=null;
		System.gc();


		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

	}
}