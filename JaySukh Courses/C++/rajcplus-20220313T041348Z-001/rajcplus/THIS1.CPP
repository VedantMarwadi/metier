#include<iostream.h>
#include<conio.h>
class math
{
	int a,b;	//instance variable

	public:
	math(int a,int b)//local variable
	{
	      this->a=a;
	      this->b=b;
	      //a=a;
	      //b=b;
	      cout<<"paramterised constructer"<<endl;
	}
	void showdata()
	{
		cout<<"a = "<<a<<endl;
		cout<<"b = "<<b<<endl;
	}
	math getobj()
	{
		return *this;
	}

	math(math &m)
	{
		a=m.a;
		b=m.b;
		cout<<"copy constructer"<<endl;
	}

};
void main()
{
	clrscr();
	math m1(45,67),m2(56,78),m3(45,56);
	m1.showdata();
	m2.showdata();
	m3.showdata();
	cout<<"m1 to m4"<<endl;
	math m4=m1.getobj();
	m4.showdata();
	math m5(0,0);
	cout<<"m2 to m5 hi"<<endl;
	m5=m2.getobj();
	m5.showdata();
	cout<<"m2 to m5 hello"<<endl;
	m5=m2;
	m5.showdata();
	getch();


}