//constructer c	alling in inheritance
#include<iostream.h>
#include<conio.h>
class A
{
	protected:
	int a;
	public:
	A()
	{
		a=10;
		cout<<"A class"<<endl;
	}
	A(int p)
	{

	     a=p;
	     cout<<"parameterised const of A class"<<endl;

	}
	~A()
	{
		cout<<"A class destructer"<<endl;
	}
};
class B:public A
{
	protected:
	int b;
	public:
	B()
	{
		b=100;
		cout<<"B class"<<endl;

	}
	B(int p,int q):A(p)
	{

	     b=q;
	     cout<<"parameterised const of B class"<<endl;

	}
	~B()
	{
		cout<<"B class destructer"<<endl;
	}

};
class C:public B
{
	int c;
	public:
	C():B()
	{
		c=1000;
		cout<<"C class"<<endl;

	}
	C(int p,int q,int r):B(p,q)
	{

	     c=r;
	     cout<<"parameterised const of C class"<<endl;

	}
	~C()
	{
		cout<<"C class destructer"<<endl;
	}
	void show()
	{
		cout<<"a = "<<a<<endl;
		cout<<"b = "<<b<<endl;
		cout<<"c = "<<c<<endl;

	}

};

void main()
{
	clrscr();
	C c1;
	c1.show();
	C c2(100,200,300);
	c2.show();
	getch();


}