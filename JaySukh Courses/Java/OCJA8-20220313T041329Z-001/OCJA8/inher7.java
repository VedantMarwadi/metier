//constructer calling in inheritance

class A
{
	int a;
	A()
	{
		a=10;
		System.out.println("A class");
	}
	A(int p)
	{
		a=p;
		System.out.println("A class parameterised");
	}

}
class B extends A
{
	int b;
	B()
	{

		b=100;
		System.out.println("B class");
	}
	B(int p)
	{
		super(p);
		b=p;
		System.out.println("B class parameterised");
	}

}
class C extends B
{
	int c;
	C()
	{

		c=1000;
		System.out.println("C class");


	}
	C(int p)
	{
		super(p);
		c=p;
		System.out.println("C class parameterised");
	}
	void show()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}

class inher7
{
	public static void main(String arg[])
	{
		C c1=new C();
		c1.show();

		C c2=new C(500);
		c2.show();
	}
}




