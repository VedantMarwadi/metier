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
	/*virtual void show()
	{
		cout<<"parent class show function"<<endl;
	}
	virtual void disp()
	{
		cout<<"parent class disp function"<<endl;

	} */

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

};

void main()
{

	clrscr();
	/*B b1;
	b1.show(); //B calss
	b1.disp(); //B class
	b1.A::show();//A class
	b1.A::disp();//A class

	C c1;
	c1.show();//C class
	c1.disp(); //C class
	c1.A::show(); //A class
	c1.A::disp(); //A class */

	//normal method overriding
	A *p; //pointer of parent class (universal remote)
	B b1;//object of child class(TV Object)
	C c1;//object of child class(AC Object)
	p=&b1;  //universal remote assign to TV Object
	p->show(); //parent class
	p->disp(); //parent class


	p=&c1; //universal remote assign to Ac Object
	p->show(); //parent class
	p->disp(); //parent class


	//virtual overriding
	/*A *p; //pointer of parent class (universal remote)
	B b1;//object of child class(TV Object)
	C c1;//object of child class(AC Object)
	p=&b1;  //universal remote assign to TV Object
	p->show(); //child class
	p->disp(); //child class


	p=&c1; //universal remote assign to Ac Object
	p->show(); //child class
	p->disp(); //child class*/
	getch();
}

