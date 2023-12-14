//constructer calling in inheritance

class A1
{
	int a;
	A1()
	{
		a=10;
		System.out.println("A class");
	}
	A1(int p)
	{
		a=p;
		System.out.println("A class");
	}


}
class B1 extends A1
{
	int b;
	/*B1()
	{
		//try
		//{
			//super();
			b=100;
			System.out.println("B class");
		//}catch(Exception e){}
	}*/
	/*B1(int p)
	{
		//super(p);
		b=p;
		System.out.println("B class");
	}*/

}
class C1 extends B1
{
	int c;
	C1()
	{
		//super(12);
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

class inher9
{
	public static void main(String arg[])
	{
		C1 c11=new C1();
		c11.show();


	}
}




