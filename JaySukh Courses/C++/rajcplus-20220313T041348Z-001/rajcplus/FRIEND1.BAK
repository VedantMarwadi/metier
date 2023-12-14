#include<iostream.h>
#include<conio.h>
class B;  //forward declaration
class A
{
	int a;
	public:
	A(int p)//parameterised
	{
		a=p;

	}
	friend int max(A,B);


};
class B
{
	int b;
	public:
	B(int p)
	{
		b=p;
	}
	friend int max(A,B);
} ;
int max(A a1,B b1)
{
      if(a1.a>b1.b)
	return a1.a;
      else
	return b1.b;
}

void main()
{
	clrscr();
	A a1(34);
	B b1(67);
	int m=max(a1,b1);
	cout<<"The maximum is "<<m<<endl;
	getch();
}