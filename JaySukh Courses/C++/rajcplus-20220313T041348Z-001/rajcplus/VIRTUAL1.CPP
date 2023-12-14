//example of virtual function
#include<iostream.h>
#include<conio.h>
#include<string.h>
class A
{
	public:
	virtual void show()
	{
		cout<<"I am virtual function"<<endl;
	}
	void disp()
	{
		cout<<"A class --I am normal function"<<endl;

	}

};
class B:public A
{
	public:
	void show()
	{
		cout<<"Class B--show function"<<endl;
	}
	void disp()
	{
		cout<<"class B-disp fuction"<<endl;

	}

};
void main()
{

	clrscr();
	B b1;
	//b1.show();
	//b1.disp();
	//b1.A::show();
	//b1.A::disp();

	A *p;
	p=&b1;
	p->show();//child
	p->disp(); //parent
	getch();
}

