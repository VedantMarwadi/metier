//constructer calling in hybrid
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
		cout<<"A class constructor"<<endl;
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
		cout<<"B class constructor"<<endl;

	}
	~B()
	{
		cout<<"B class destructer"<<endl;
	}

};
class C:public A
{
	protected:
	int c;
	public:
	C()
	{
		c=1000;
		cout<<"C class constructor"<<endl;

	}
	~C()
	{
		cout<<"C class destructer"<<endl;
	}


};
class D:public B,public C
{
	int d;
	public:
	D()
	{
		d=10000;
		cout<<"D class constructor"<<endl;

	}
	~D()
	{
		cout<<"D class destructer"<<endl;
	}

	void show()
	{
		//cout<<"a = "<<a<<endl;
		cout<<"b = "<<b<<endl;
		cout<<"c = "<<c<<endl;
		cout<<"d = "<<d<<endl;

	}
};

void main()
{
	clrscr();
	D d1;
	d1.show();
	getch();


}