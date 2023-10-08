//method overriding
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
	void getdata()
	{
		emp::getdata();
		cout<<"Enter department";
		cin>>dept;
	}
	void showdata()
	{

		emp::showdata();
		cout<<"Department = "<<dept<<endl;
	}

};
void main()
{
	clrscr();
	manager m1;
	cout<<"Enter data for manager1"<<endl;
	//m1.emp::getdata();
	m1.getdata();
	//m1.emp::showdata();
	m1.showdata();

	getch();


}