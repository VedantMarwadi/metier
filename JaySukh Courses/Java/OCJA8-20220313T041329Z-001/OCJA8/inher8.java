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
	B(int p,int q)
	{
		super(p);
		b=q;
		System.out.println("B class parameterised");
	}

}
class C extends B
{
	int c;
	C()
	{
		this(67,89,89);
		c=1000;
		System.out.println("C class");


	}
	C(int p,int q,int r)
	{
		super(p,q);
		c=r;
		System.out.println("C class parameterised");
	}
	void show()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}

class inher8
{
	public static void main(String arg[])
	{
		C c1=new C();
		c1.show();

		C c2=new C(100,200,300);
		c2.show();
	}
}




