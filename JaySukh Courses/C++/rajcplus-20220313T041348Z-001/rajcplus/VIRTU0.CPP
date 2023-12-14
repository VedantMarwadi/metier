//example of method overriding
#include<iostream.h>
#include<conio.h>

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

	b1.show(); //child class
	b1.disp(); //child class
	b1.A::show();//parent class
	b1.A::disp(); //parent class
	getch();
}

