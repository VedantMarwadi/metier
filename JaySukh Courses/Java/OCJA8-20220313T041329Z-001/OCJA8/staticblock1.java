class staticblock1
{
	int a;//instance variable
	static int count=10;//static variable

	staticblock1()
	{
		System.out.println("constructer");
	}
	staticblock1(int p)
	{
		System.out.println("parameterised constructer");
	}
	static//static block
	{
		System.out.println("count "+count);
		count=100;
		System.out.println("static block1");
		//staticblock1 s1=new staticblock1();
	}
	static//static block
	{
		System.out.println("static block2");
		System.out.println(count);
	}
	{//object initializer block
		a=10;
		System.out.println("normal block or object initializer block");
	}
	{//object initializer block
			//a=10;
			System.out.println("normal block or object initializer block2");
	}
	public void show()
	{
		System.out.println(a+"\t"+count);
	}
	public static void main(String arg[])
	{
		System.out.println(count);
		System.out.println("Hello");
		staticblock1 s1=new staticblock1();
		staticblock1 s2=new staticblock1();

		staticblock1 s3=new staticblock1(56);
		staticblock1 s4=new staticblock1(89);
		s1.show();
		s2.show();
		s3.show();
		s4.show();
	}
}