//hirarchical or tree
#include<iostream.h>
#include<conio.h>
class emp
{
	int codeno;
	char name[25];
	char address[50];
	long int phone;

	public:
	void getdata()
	{
		cout<<"Enter codeno";
		cin>>codeno;
		cout<<"Enter name";
		cin>>name;
		cout<<"Enter address";
		cin>>address;
		cout<<"Enter phoneno";
		cin>>phone;

	}
	void showdata()
	{
	       cout<<"Codeno = "<<codeno<<endl;
	       cout<<"Name = "<<name<<endl;
	       cout<<"Address = "<<address<<endl;
	       cout<<"Phone No = "<<phone<<endl;
	}
};
class manager:public emp
{
	char dept[25];
	public:
	void getdept()
	{
		getdata();
		cout<<"Enter department";
		cin>>dept;
	}
	void showdept()
	{
		showdata();
		cout<<"Department = "<<dept<<endl;
	}

};
class engineer:public emp
{
	char qua[25];
	public:
	void getqua()
	{
		getdata();
		cout<<"Enter Qualification";
		cin>>qua;
	}
	void showqua()
	{
		showdata();
		cout<<"Qualification = "<<qua<<endl;
	}

};
class supervisor:public emp
{
	int noofhours;
	public:
	void getnoofhours()
	{
		getdata();
		cout<<"Enter No of hours to work";
		cin>>noofhours;
	}
	void shownoofhours()
	{
		showdata();
		cout<<"No of Hours = "<<noofhours<<endl;
	}

};

void main()
{
	clrscr();
	manager m1;
	engineer e1;
	supervisor s1;
	cout<<"Enter data for manager"<<endl;
	//m1.getdata();
	m1.getdept();
	//m1.showdata();
	m1.showdept();
	cout<<"Enter data for engineer"<<endl;

	//e1.getdata();
	e1.getqua();
	//e1.showdata( );
	e1.showqua();

	cout<<"Enter data for Supervisor"<<endl;

	//s1.getdata();
	s1.getnoofhours();
	//s1.showdata( );
	s1.shownoofhours();


	getch();


}