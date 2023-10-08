//binary opearator overloading(+,-,*,/)
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
	oper operator+(int no)
	{
		oper temp;
		temp.a=a+no;
		temp.b=b+no;
		return temp;


	}

	oper operator+(oper o2)
	{
		oper temp;
		temp.a=a+o2.a;
		temp.b=b+o2.b;
		return temp;


	}
	oper operator-(oper o2)
	{
		oper temp;
		temp.a=a-o2.a;
		temp.b=b-o2.b;
		return temp;


	}
	oper operator*(oper o2)
	{
		oper temp;
		temp.a=a*o2.a;
		temp.b=b*o2.b;
		return temp;


	}
	oper operator/(oper o2)
	{
		oper temp;
		temp.a=a/o2.a;
		temp.b=b/o2.b;
		return temp;


	}
	friend oper operator+(int,oper);




} ;
oper operator+(int no,oper o1)
{
	oper temp;
	temp.a=o1.a+no;
	temp.b=o1.b+no;
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

	o3=o1*o2;
	o3.show();

	o3=o1/o2;
	o3.show();

	o3=o1+10;
	o3.show();

	/*o3=o1-10;
	o3.show();

	o3=o1*10;
	o3.show();

	o3=o1/10;
	o3.show(); */




	o3=10+o1; //you must use friend function

	o3.show();
	getch();
}