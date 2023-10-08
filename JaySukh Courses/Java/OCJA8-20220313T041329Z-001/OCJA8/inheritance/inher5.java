//polymorphic Argument
import java.util.*;
class A
{

	void getdata()
	{
		System.out.println("getdata of A class --Parent");
	}
	void showdata()
	{
		System.out.println("showdata of A class---Parent");

	}
	void disp()
	{
		System.out.println("disp of A class ----parent method");
	}

}
class B extends A
{
	void getdata()
	{
		System.out.println("getdata of B class --Child");
	}
	void showdata()
	{
		System.out.println("showdata of B class---Child");
	}
	void show()
	{
			System.out.println("show of B class ----child");
	}

}
class C extends A
{
	void getdata()
	{
		System.out.println("getdata of C class --Child");
	}
	void showdata()
	{
		System.out.println("showdata of C class---Child");
	}
	void show()
	{
			System.out.println("show of C class ----child");
	}

}

class inher5
{
	static void disp(A a1)//polymorphic argument
	{
		a1.getdata();//for B & C child// for A--parent
		a1.showdata();//for B & C child// for A--parent
		a1.disp();//parent
		if(a1 instanceof B)
		{
			B b1=(B)a1;
			b1.show();
		}
		if(a1 instanceof C)
		{
			C c1=(C)a1;
			c1.show();
		}

	}


	public static void main(String arg[])
	{
		A a1=new A();
		B b1=new B();
		C c1=new C();
		disp(b1);
		disp(c1);
		disp(a1);
	}
}