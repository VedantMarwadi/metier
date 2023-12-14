//example of pure virtual function and aBSTRACT CLASS
#include<iostream.h>
#include<conio.h>

const float PI=3.14;
class shape  //abstract class
{

	public:

	virtual void area()=0;//pure virtual function
	virtual void cir()=0;//pure virtual function
	void parent()
	{
		cout<<"different type of shapes"<<endl;
	}

};
class rect:public shape
{
	float l,w;
	public:
	rect(float ll,float ww)
	{
		l=ll;
		w=ww;
	}
	rect(shape *p)
	{
	   cout<<"I am constructer of rectangel"<<endl;
	}

	void area()
	{
		cout<<"area of rectangel is "<<(l*w)<<endl;
	}
	void cir()
	{
		cout<<"perirpheri of the rectange is "<<(2*(l+w))<<endl;

	}
	void my()
	{
		cout<<"child itself"<<endl;

	}

};
class circle:public shape
{
	float r;
	public:
	circle(float rr)
	{
		r=rr;

	}
	circle(shape *p)
	{
	     cout<<"I am constructer of circle"<<endl;
	}

	void area()
	{
		cout<<"area of cir is "<<(PI*r*r)<<endl;
	}
	void cir()
	{
		cout<<"circumference of the circle is "<<(2*PI*r)<<endl;

	}
	void my()
	{
		cout<<"child itself"<<endl;

	}

};
class tri:public shape
{
	void area()
	{
	}
	void cir()
	{
	}

};

void main()
{

	clrscr();
	shape *s1;
	rect r1(10,20);
	circle c1(3.5);

	s1=&r1;
	s1->area();//rectangle
	s1->cir();  //rectangele
	s1->parent();//shape
	((rect)s1).my();//down casting
	//s1->my();//error

	s1=&c1;
	s1->area();  //circle
	s1->cir();  //circle
	s1->parent(); //shape
	//s1->my(); //error
	((circle)s1).my();
	//circle c2=(circle)s1;
	//c2.my();

	//s1->my();//error


	//shape s2;//because shape is an abstract class
	tri t1; //abstract class
	s1=&t1;
	s1->area();  //tri
	s1->cir();  //tri
	s1->parent(); //shape


	getch();
}