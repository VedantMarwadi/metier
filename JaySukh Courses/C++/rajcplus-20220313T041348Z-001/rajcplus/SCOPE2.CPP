#include<iostream.h>
#include<conio.h>

class math
{
	int a,b;

	public:
	math();
	math(int,int);
	math(int);
	void showdata()
	{
		cout<<"a = "<<a<<endl;
		cout<<"b = "<<b<<endl;

	}
	~math()
	{
		cout<<"I am destructer"<<a<<b<<endl;
	}

};
math::math()
{
	a=0;
	b=0;
	cout<<"default constructer"<<endl;
}
math::math(int c,int d)
{
	a=c;
	b=d;
	cout<<"paramterised constructer"<<endl;
}
math::math(int c)
{
	a=c;
	b=100;
	cout<<"one paramterised constructer"<<endl;
}
void main()
{
	clrscr();
	math m1,m2,m3(45,67),m4(56,78),m5(45),m6(123);
	m1.showdata();
	m2.showdata();
	m3.showdata();
	m4.showdata();
	m5.showdata();
	m6.showdata();
	getch();


}