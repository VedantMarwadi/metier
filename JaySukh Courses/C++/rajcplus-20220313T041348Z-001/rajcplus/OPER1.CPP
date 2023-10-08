//unnery opearator overloading(++,--,-)
#include<iostream.h>
#include<conio.h>
class oper
{
	int a,b;
	public:
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
	void operator++()
	{
		a++;
		b++;
	}
	void operator--()
	{
		a--;
		b--;
	}
	void operator-()
	{
		a=-a;
		b=-b;
	}



} ;
void main()
{

	clrscr();
	oper o1(10,20);
	o1.show();
	o1++;
	o1.show();
	++o1;
	o1.show();
	o1--;
	o1.show();
	--o1;
	o1.show();
	-o1;
	o1.show();
	-o1;
	o1.show();


	getch();


}
