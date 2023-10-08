class math
{
	int a,b;//instance variables
	math(int d)
	{
		this();//It must be the first statement
		a=d;
		b=d;
		System.out.println("one parameterised constructer");
	}
	math(int c,int d)
	{
		this(c);//It must be the first statement
		a=c;

		b=d;
		System.out.println("two parameterised constructer");
	}
	math()
	{
		//this(10,20);
		a=0;
		b=0;
		System.out.println("default constructer");
	}
	void show()
	{
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}


}
class this2
{
	public static void main(String arg[])
	{

		//math m1=new math();
		//m1.show();
		math m2=new math(100,20);
		m2.show();
		//math m3=new math(500);
		//m3.show();






	}
}