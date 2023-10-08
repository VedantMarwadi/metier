class A
{
	static
	{
		System.out.println("statick block of A");
	}
	{
		System.out.println("Noramal block of A");
	}
	A()
	{
		System.out.println("Constructer A");
	}
}

class B extends A
{
	static
	{
		System.out.println("statick block of B");
	}
	{
		System.out.println("Noramal block of B");
	}
	B()
	{
			System.out.println("Constructer B");
	}

}
class staticblock2
{
	public static void main(String arg[])
	{
				B b1=new B();
				B b2=new B();

	}
}

/*A--B--C--D

D d1=new D();

A class -memory load----static block of A class
B class -memory load----static block of B class
C class -memory load----static block of C class
D class -memory load----static block of D class

A---object initializer block then constructer of A
B---object initializer block then constructer of B
C---object initializer block then constructer of C
D---object initializer block then constructer of D*/