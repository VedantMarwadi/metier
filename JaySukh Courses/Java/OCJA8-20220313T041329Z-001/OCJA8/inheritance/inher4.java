//dynamic method dispatch or vrtuial method invocation
import java.util.*;
class A
{
	int a=10;
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
	int a=100;//instance variable hiding
	void getdata()//method overrding
	{
		System.out.println("getdata of B class --Child");
	}
	void showdata()//method overrding
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
	int a=1000;//instance variable hiding
	void getdata()//method overrriding
	{
		System.out.println("getdata of C class --Child");
	}
	void showdata()//method overrriding
	{
		System.out.println("showdata of C class---Child");
	}
	void show()
	{
			System.out.println("show of C class ----child");
	}

}

class inher4
{
	public static void main(String arg[])
	{
		A a1;
		a1=new B();
		a1.getdata();//B
		a1.showdata();//B
		a1.disp();//A
		//a1.show();//error
		((B)a1).show();//down casting


		a1=new C();
		a1.getdata();//C
		a1.showdata();//C
		a1.disp();//A
		//a1.show();//error
		((C)a1).show();


		System.out.println(a1.a);//reference-A-a-A
		B b1=new B();
		System.out.println(b1.a);//reference-B-a-B
		C c1=new C();
		System.out.println(c1.a);//reference C-a-C




	}
}