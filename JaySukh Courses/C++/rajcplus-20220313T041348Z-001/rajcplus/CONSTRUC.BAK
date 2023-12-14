#include<iostream.h>
#include<conio.h>
class math
{
	int a,b;

	public:
	math()
	{
		a=0;
		b=0;
		cout<<"without parameter constructer"<<endl;
	}
	math(int c,int d)
	{
		a=c;
		b=d;
		cout<<"paramterised constructer"<<endl;
	}
	math(int c)
	{
		a=c;
		b=c;
		cout<<"one paramterised constructer"<<endl;

	}


	math(math &m)//	copy constructer
	{
	   a=m.a;
	   b=m.b;
	   cout<<"copy constructer"<<endl;

	}
	void showdata()
	{
		cout<<"\na = "<<a<<endl;
		cout<<"b = "<<b<<endl;

	}
       ~math()  //destructor
	{
		cout<<"I am destructer"<<a<<b<<endl;
	}

};
void main()
{
	clrscr();
	math m1,m2,m3(45,67),m4(56,78),m5(45),m6(123);
	cout<<"Press any key to continue"<<endl;
	getch();
	m1.showdata();
	m2.showdata();
	m3.showdata();
	m4.showdata();
	m5.showdata();
	m6.showdata();
	math m7=m3; //copy constructer
	cout<<"m7"<<"\t" ;
	m7.showdata();
	math m8(m4); //copy constructer
	cout<<"m8"<<"\t" ;
	m8.showdata();
	math m9; //default constructer
	m9.showdata();
	m9=m4; //by using assignment operator
	cout<<"m9"<<"\t" ;
	m9.showdata();

	getch();


}