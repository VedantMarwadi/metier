//mutilevel
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
class gmanager:public manager
{
	int spallowance;
	public:
	void getspallowance()
	{

		getdept();
		cout<<"Enter special allowance";
		cin>>spallowance;
	}
	void showspallowance()
	{

		showdept();
		cout<<"Special allowance = "<<spallowance<<endl;
	}

};

void main()
{
	clrscr();
	gmanager g1;

	cout<<"Enter data for general manager"<<endl;
	//g1.getdata();
	//g1.getdept();
	g1.getspallowance();
	//g1.showdata();
	//g1.showdept();
	g1.showspallowance();
	getch();


}