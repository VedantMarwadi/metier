//object to object
//paramerised constructer in destination class
#include<iostream.h>
#include<conio.h>
class A
{
	int a,b;
	public:
	A(int p,int q)
	{
		a=p;
		b=q;

	}
	void show()
	{
		cout<<"a = "<<a<<endl;
		cout<<"b = "<<b<<endl;
	}
	int geta()
	{
		return a;
	}
	int getb()
	{
		return b;
	}


};
class B
{
	int c;
	public:
	B(A obj)//paramerised(source object) constructer
	{
		c=obj.geta()*obj.getb();
	}
	void show()
	{
		cout<<c<<endl;
	}
};
void main()
{
	A a1(10,20);
	clrscr();
	B b1=a1;
	b1.show();


	getch();

}