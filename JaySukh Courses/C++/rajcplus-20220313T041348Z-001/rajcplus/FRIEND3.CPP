#include<iostream.h>
#include<conio.h>
class A
{
	int a;
	public:
	A(int p)//parameterised
	{
		a=p;

	}
	int geta()
	{
		return a;
	}
};
class B
{
	int b;
	public:
	B(int p)
	{
		b=p;
	}
	int max(A a1,B b1)
	{
		int mya=a1.geta();
		if(mya>b1.b)
			return mya;
		else
			return b1.b;

	}
	int max2(A a1)
	{
		int mya=a1.geta();
		if(mya>b)
			return mya;
		else
			return b;

	}
} ;


void main()
{
	clrscr();
	A a1(34);
	B b1(67);
	int m=b1.max(a1,b1);
	cout<<"The maximum is "<<m<<endl;
	int m2=b1.max2(a1);
	cout<<"The maximum is "<<m2<<endl;

	getch();
}