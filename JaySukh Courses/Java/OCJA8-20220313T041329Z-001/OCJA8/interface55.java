interface i3
{
	void h3();//bydefault public and abstract
}
interface i2
{
	public void h2();//bydefault public and abstract
}
interface i1 extends i2,i3//multiple inheritance
{
	abstract void h1();//bydefault public and abstract
}
interface shape
{
	float PI=3.14f;//by default public static and final
	void area();//by default public and abstract
	void cir();//by default public and abstract

}
class rect implements shape,i1//multiple inheritance
{
	int l,w;
	rect(int ll,int ww)
	{
		l=ll;
		w=ww;
	}
	public void area()
	{
		System.out.println("are of rectange is "+(l*w));

	}
	public void cir()
	{
		System.out.println("perimeter of rectangel is "+2*(l+w));

	}
	void disp()
	{
		System.out.println("chidl method");
	}
	public void h1(){}
	public void h2(){}
	public void h3(){}


}
class cir implements shape
{
	int r;
	cir(int rr)
	{
		r=rr;

	}
	public void area()
	{
		System.out.println("are of circle is "+(PI*r*r));

	}
	public void cir()
	{
		System.out.println("circumference of circle is "+(2*PI*r));

	}
	void disp()
	{
		System.out.println("chid2 method");
	}

}
 abstract class tri implements shape
{
	public void area()
	{
		System.out.println("triangle class");
	}
	//public void cir(){}
}
class my extends tri
{
	public void cir(){System.out.println("triangle class");}
}
class interface55
{

	public static void main(String arg[])
	{


		rect r1=new rect(23,67);
		r1.area();
		r1.cir();
		r1.disp();

		cir c1=new cir(23);
		c1.area();
		c1.cir();
		c1.disp();

		//tri t1=new tri();
		my m1=new my();
		m1.area();
		m1.cir();


	}

}