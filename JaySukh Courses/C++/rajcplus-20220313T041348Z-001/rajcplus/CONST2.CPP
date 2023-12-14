#include<iostream.h>
#include<conio.h>

class math
{
	int a,b;

	public:
	math(int c=0,int d=0) //default argument
	{
		a=c;
		b=d;
		cout<<"paramterised constructer"<<endl;

	}

	void showdata()
	{
		cout<<"\na = "<<a<<endl;
		cout<<"b = "<<b<<endl;

	}
       ~math()
	{
		cout<<"I am destructer"<<a<<b<<endl;
	}

};
void main()
{
	clrscr();
	math m1,m2;
	math m3(10,20);
	math m4(50,100);
	math m5(100);
	m1.showdata();
	m2.showdata();
	m3.showdata();
	m4.showdata();
	m5.showdata();
	getch();


}