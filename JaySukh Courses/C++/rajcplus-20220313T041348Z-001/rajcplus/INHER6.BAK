//constructer calling in inheritance
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
class C:public B
{
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
	getch();


}