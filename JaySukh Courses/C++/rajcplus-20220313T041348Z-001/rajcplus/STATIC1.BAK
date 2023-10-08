#include<iostream.h>
#include<conio.h>
class static1
{
	public:
	int id;//instance variable
	static int count;//static vraiable or class variable
	static1()
	{
		count++;
		id=count;
		cout<<"constructer"<<endl;
	}
	void show()//instance method
	{
		cout<<"Id = "<<id<<endl;
		cout<<"Count = "<<count<<endl;
	}
	static void disp()//class method
	{
		cout<<"count ="<<count<<endl;
		static1 s6;
		cout<<"Id ="<<s6.id<<endl;
	}
};
int static1::count;
void main()
{
	clrscr();
	cout<<static1::count<<endl;
	static1::disp();

	static1 s1,s2,s3;
	s1.show();
	s2.show();
	s3.show();
	cout<<s1.id<<endl;
	cout<<s2.id<<endl;
	cout<<s3.id<<endl;
	cout<<s1.count<<endl;
	cout<<s2.count<<endl;
	cout<<s3.count<<endl;
	cout<<static1::count<<endl;
	static1::disp();
	s1.disp();
	s2.disp();
	s3.disp();
	cout<<static1::count<<endl;

	static1 s4,s5;
	s4.show();
	s5.show();
	cout<<static1::count<<endl;
	static1::disp();
	cout<<static1::count<<endl;
	cout<<s1.count<<endl;
	cout<<s2.count<<endl;
	cout<<s3.count<<endl;

	getch();
}