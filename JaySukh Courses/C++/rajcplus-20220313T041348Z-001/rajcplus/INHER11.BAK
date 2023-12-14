//visibility of parent class memeber through inheritance
#include<iostream.h>
#include<conio.h>
class emp
{

	public:
	int codeno;
	char name[25];
	char address[50];
	long int phone;


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
class manager: public  emp
{
	char dept[25];
	public:
	void get()
	{
		cout<<codeno;
		getdata();
		cout<<"Enter department";
		cin>>dept;
	}
	void show()
	{
		showdata();
		cout<<"Department = "<<dept<<endl;
	}

};
void main()
{
	clrscr();
	manager m1;
	m1.codeno=34;
	cout<<"Enter data for manager1"<<endl;
	m1.getdata();
	m1.get();
	m1.showdata();
	m1.show();
	getch();


}