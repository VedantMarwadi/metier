//constructer calling in inheritance

class A
{
	int a;
	A()
	{
		//check this() or super() in first statement   if not then java places super()
		a=10;
		System.out.println("A class");
	}
}
class B extends A
{
	int b;
	B()
	{
		//check this() or super() in first statement   if not then java places super()
		b=100;
		System.out.println("B class");
	}
}
class C extends B
{
	int c;
	C()
	{
		//check this() or super() in first statement   if not then java places super()
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

class inher4
{
	public static void main(String arg[])
	{
		C c1=new C();
		c1.show();


	}
}




