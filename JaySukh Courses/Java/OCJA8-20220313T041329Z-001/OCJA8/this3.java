class math
{
	int a,b,c;
	math(int p,int q)
	{
		this(p);
		b=q;
		System.out.println("one parameterised constructer");
	}
	math(int p,int q,int r)
	{
		this(p,q);
		c=r;
		System.out.println("parameterised constructer");
	}
	math(int p)
	{
		a=p;
		System.out.println("default constructer");

	}
	void show()
	{
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("c ="+c);
	}


}
class this3
{
	public static void main(String arg[])
	{
		/*math m1=new math();
		m1.show();*/

		math m2=new math(100,20,45);
		m2.show();

		/*math m3=new math(34);
		m3.show();*/




	}
}