interface i3
{
	void h3();//public and absract
}
interface i2
{
	public void h2();//abstract
}
interface i1 extends i2,i3//multiple inheritance
{
	abstract void h1();//public
}
interface shape
{
	float PI=3.14f;//public static and final
	void area();//public and abstract
	void cir();//public and abstract

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
	public void cir(){}
}
class interface1
{
	void disp(shape s)//reference of interface  polymorphic argument
	{
		s.area();
		s.cir();
	}
	/*void show()
	{
		disp()
	}*/
	public static void main(String arg[])
	{

		//method overriding
		rect r1=new rect(23,67);
		r1.area();
		r1.cir();
		r1.disp();

		cir c1=new cir(23);
		c1.area();
		c1.cir();
		c1.disp();

		//dynamic method dispatch
		shape s;
		s=new rect(23,67);
		s.area();
		s.cir();

		//s.disp();//error
		((rect)s).disp();

		s=new cir(23);
		s.area();
		s.cir();

		//s.disp();//error
		((cir)s).disp();

		interface1 i1=new interface1();
		i1.disp(r1);
		i1.disp(c1);
		i1.disp(s);
		i1.disp(new my());
		System.out.println(shape.PI);

	}

}