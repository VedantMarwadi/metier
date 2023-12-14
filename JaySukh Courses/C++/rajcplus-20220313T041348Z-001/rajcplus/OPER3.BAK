//binary opearator overloading(<,>,<=,>=,==,!=)
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

	int operator ==(oper o2)
	{
		if(a==o2.a && b==o2.b)
			return 1;
		else
			return 0;

	}
	int operator<=(oper o2)
	{
		if(a<=o2.a && b<=o2.b)
			return 1;
		else
			return 0;


	}
} ;
void main()
{
	clrscr();
	oper o1(10,20),o2(20,30);
	o1.show();
	o2.show();
	if(o1<=o2)
		cout<<"o1<=o2"<<endl;
	else
		cout<<"o1>=o2"<<endl;

	if(o1==o2)
		cout<<"o1==o2"<<endl;
	else
		cout<<"o1 not equal to o2"<<endl;


	getch();
}