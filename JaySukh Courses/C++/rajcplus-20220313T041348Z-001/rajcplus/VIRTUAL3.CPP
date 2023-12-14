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
	void parent()
	{
		cout<<"parent itself"<<endl;
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
	void my()
	{
		cout<<"child itself"<<endl;

	}

};
void main()
{

	clrscr();
	A *a1;
	B b1;
	a1=&b1;
	a1->show(); //child because parent virtual
	a1->disp(); //method overriding---parent
	a1->parent();//parent class function
	//a1->my();//error
	getch();
}

