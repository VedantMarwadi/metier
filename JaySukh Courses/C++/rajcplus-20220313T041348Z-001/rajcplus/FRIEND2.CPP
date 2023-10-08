
#include<iostream.h>
#include<conio.h>
class C; //forward declaration
class B;//forward declaration
class A
{
       float a;
	public:
	A(float p)//parameterised
	{
		a=p;

	}
	friend float avg(A,B,C);


};
class B
{
	float b;
	public:
	B(float p)
	{
		b=p;
	}
	friend float avg(A,B,C);
};
class C
{
	float c;
	public:
	C(float p)
	{
		c=p;
	}
	friend float avg(A,B,C)
};

float avg(A a1,B b1,C c1)
{
	return (a1.a+b1.b+c1.c)/3;
}
void main()
{
	clrscr();
	A a1(34.12);
	B b1(67.10);
	C c1(12.14);
	float m=avg(a1,b1,c1);
	cout<<"The avg is "<<m<<endl;
	getch();
}