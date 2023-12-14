abstract class shape
{
	public final float PI=3.14f;
	abstract void area();
	abstract void cir();
	shape()
	{
		System.out.println("I am constructer of shape class");
	}
	public void show()
	{
		System.out.println("concrete method");
	}
	public static void staticfun()
	{
		System.out.println("static function of an abstract class");
	}
	public final void finalfun()
	{
		System.out.println("final method of an abstract class");
	}
	//public final abstract void my();

}
class rect extends shape
{
	int l,w;
	rect(int ll,int ww)
	{
		l=ll;
		w=ww;
		System.out.println("I am constructer of rectangle class");
	}
	void area()
	{
		System.out.println("are of rectange is "+(l*w));

	}
	void cir()
	{
		System.out.println("circumference of rectangel is "+2*(l+w));

	}
	void disp()
	{
		System.out.println("chidl method");
	}


}
class cir extends shape
{
	int r;
	cir(int rr)
	{
		r=rr;
		System.out.println("I am constructer of circle class");
	}
	void area()
	{
		System.out.println("are of circle is "+(PI*r*r));

	}
	void cir()
	{
		System.out.println("circumference of circle is "+(2*PI*r));

	}
	void disp()
	{
		System.out.println("chid2 method");
	}

}
 abstract class tri extends shape
{
	void area()
	{
		System.out.println("area of triangle method");
	}
	//void cir(){}
}
class my extends tri
{
	void cir()
	{
		System.out.println("cir of triangle method");
	}
}
class abstract1
{
	void disp(shape s)//parent class reference polymorphic argument
	{
		s.area();
		s.cir();
	}
	public static void main(String arg[])
	{
		//shape s=new shape();//error
		//method overriding
		rect r1=new rect(23,67);
		r1.area();//rect---overide
		r1.cir();//rect------overide
		r1.show();//shape--concrete method
		r1.disp();//---child individual function
		r1.staticfun();//shape static function

		cir c1=new cir(23);
		c1.area();//cir---overide
		c1.cir();//cir------overide
		c1.show();//shape--concrete method
		c1.disp();//---child indivudual function
		c1.staticfun();////shape static function

		//dynamic method dispatch
		shape s;
		s=new rect(23,67);
		s.area();
		s.cir();
		s.show();
		//s.disp();//error
		((rect)s).disp();
		s.staticfun();

		s=new cir(23);
		s.area();
		s.cir();
		s.show();
		//s.disp();//error
		((cir)s).disp();
		s.staticfun();

		abstract1 abs1=new abstract1();
		System.out.println("polymorphic argument");
		abs1.disp(r1);
		abs1.disp(c1);
		abs1.disp(s);

		shape.staticfun();
		my m1=new my();
		m1.area();
		m1.cir();
		//tri t1=new tri();
	}

}
