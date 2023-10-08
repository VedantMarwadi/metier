//constructer calling in inheritance

class A
{
	int a;
	A()
	{
		super();
		a=10;
		System.out.println("A class");
	}


}
class B extends A
{
	int b;
	B()
	{
		super();
		b=100;

		System.out.println("B class");
	}


}
class C extends B
{
	int c;
	C()
	{

		super();
		c=1000;
		System.out.println("C class");


	}
	void show()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}

class inher5
{
	public static void main(String arg[])
	{
		C c1=new C();
		c1.show();


	}
}




