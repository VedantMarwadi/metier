//method overloading or function overloading
#include<iostream.h>
#include<conio.h>
class shape
{
	public:
	void area(float r)
	{
		cout<<"area of circle is "<<(3.14*r*r)<<endl;
	}
	float area(float l,float w)
	{
	     float a;
	     a=l*w;
	     return a;

	}
	float area(float l,float w,float h)
	{
		return l*w*h/2;
	}
	void area()
	{
		cout<<"Different Shapes"<<endl;
	}

};
void main()
{
	clrscr();
	shape s1;
	s1.area();
	s1.area(2.3);
	float a=s1.area(2.3,4.5);
	cout<<"area of rectangel is "<<a<<endl;
	a=s1.area(2.3,4.5,6.7 );
	cout<<"area of Triangle is "<<a<<endl;

	getch();
}