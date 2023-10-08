//binary opearator overloading using friend function(+)
#include<iostream.h>
#include<conio.h>
class oper
{
	int a,b;
	public:
	oper()
	{
		a=0;
		b=0;
	}
	oper(int c,int d)
	{
		a=c;
		b=d;
	}
	void show()
	{
		cout<<"a = "<<a<<endl;
		cout<<"b = "<<b<<endl;
	}

	friend oper operator+(oper,oper);
	friend oper operator-(oper,oper);

} ;
oper operator+(oper o1,oper o2)
{
	oper temp;
	temp.a=o1.a+o2.a;
	temp.b=o1.b+o2.b;
	return temp;

}
oper operator-(oper o1,oper o2)
{
	oper temp;
	temp.a=o1.a-o2.a;
	temp.b=o1.b-o2.b;
	return temp;

}

void main()
{
	clrscr();
	oper o1(10,20),o2(20,30),o3;
	o1.show();
	o2.show();
	o3.show();
	o3=o1+o2;
	o3.show();
	o3=o1-o2;
	o3.show();



	getch();
}