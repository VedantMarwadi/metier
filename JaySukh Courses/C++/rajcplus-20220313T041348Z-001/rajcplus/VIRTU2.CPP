//example of method overriding
#include<iostream.h>
#include<conio.h>
#include<string.h>
class A
{
	public:
	virtual void show()
	{
		cout<<"parent class show function"<<endl;
	}
	virtual void disp()
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
	void individual()
	{
		cout<<"This is child's individual fuction"<<endl;
	}

};
class C:public A
{
	public:
	void show()
	{
		cout<<"child Class C--show function"<<endl;
	}
	void disp()
	{
		cout<<"child class C-disp fuction"<<endl;

	}
	void individual()
	{
		cout<<"This is child's individual fuction"<<endl;
	}

};
class D:public A
{
	public:
	void show2()
	{
		cout<<"child Class D--show function"<<endl;
	}
	void disp2()
	{
		cout<<"child class D-disp fuction"<<endl;

	}

};



void main()
{

	clrscr();
	A *p;
	B b1;
	p=&b1;
	p->show(); //child class(B)
	p->disp(); //child class(B)
	//p->individual();

	C c1;
	p=&c1;
	p->show(); //child class(C)
	p->disp(); //child class(C)
	//p->individual();

	D d1;
	p=&d1;
	//p->show2(); //compilation error
	//p->disp2(); //compilation error
	getch();
}

