//example of method overriding
#include<iostream.h>
#include<conio.h>
#include<string.h>
class A
{
	public:
	void show()
	{
		cout<<"parent class show function"<<endl;
	}
	void disp()
	{
		cout<<"parent class disp function"<<endl;

	}

};
class B:public A
{
	public:
	void show()
	{
		cout<<"child Class B--show function"<<endl;
	}
	void disp()
	{
		cout<<"child class B-disp fuction"<<endl;

	}

};
void main()
{

	clrscr();
	B b1;
	b1.show();
	b1.disp();
	b1.A::show();
	b1.A::disp();
	getch();
}

