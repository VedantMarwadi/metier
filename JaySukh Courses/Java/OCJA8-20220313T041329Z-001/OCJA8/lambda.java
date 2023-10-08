
interface i1
{
	int add(int a,int b);
}
interface i2
{
	void show();
}
interface i3
{
	void show(int a);
}
interface i4
{
	int show();
}
interface i5
{
	int show(int a);
}
interface i6
{
	int show(int a,int b,int c);
}
class A implements i1
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
class lambda
{
	public static void main(String arg[])
	{
		A a1=new A();
		int c=a1.add(10,20);
		System.out.println(c);

		//anonomus class
		c=new i1()
		{
			public int add(int a,int b)
			{
				return a+b;
			}
		}.add(10,20);
		System.out.println(c);

		i1 a=(p,q)->p+q;
		//i1 a=(a,b)->{return a+b;};
		c=a.add(10,20);
		System.out.println(c);


		i2 p=()->System.out.println("hello");
		p.show();

		i3 q=(x)->System.out.println("hello "+x);
		q.show(10);

		i4 r=()->{return 10;};
		//i1 p=()->10;
		System.out.println(r.show());


		i5 m=y->{return y*y;};
		System.out.println(m.show(10));

		i6 n=(e,f,g)->{return e*f*g;};
		System.out.println(n.show(2,3,5));
	}
}