#include<iostream.h>
class static1
{
	int id;//instance variable;
	public:
	static int count;//class variable


	static1()
	{
		count++;
		id=count;
	}
	void show()
	{
		cout<<"Id = "<<id<<endl;
		cout<<"count = "<<count<<endl;
	}
	static void disp()
	{
		cout<<"count in static function "<<count<<endl;
		static1 s1;
		cout<<"id of s1 "<<s1.id<<endl;
	}
} ;
int static1::count;

void main()
{
	static1 s1,s2;
	s1.show();
	s2.show();
	static1 s3,s4;
	s3.show();
	s4.show();
	cout<<static1::count<<endl;
	static1::disp();
	cout<<static1::count<<endl;
	s1.disp();
	s2.disp();
	s3.disp();
	s4.disp();
	cout<<static1::count<<endl;




}