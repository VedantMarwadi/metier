#include<iostream.h>
#include<conio.h>
#include<fstream.h>
#include<iomanip.h>
class student
{
	int rollno;
	char name[25];
	long int ph;
	public:
	void getdata()
	{
		cout<<"Enter rollno name and phone no";
		cin>>rollno>>name>>ph;
	}
	void showdata()
	{
		cout.setf(ios::left);
		cout<<setw(8)<<rollno<<setw(13)<<name<<setw(10)<<ph<<endl;
	}
};
void main()
{
	ofstream out;
	clrscr();
	char ch;
	out.open("jay4.txt",ios::binary|ios::app);
	student s1,s2;
	do
	{
		s1.getdata();
		out.write((char*)&s1,sizeof(s1));
		cout<<"do u want to add another student(y/n)"<<endl;
		cin>>ch;
	}
	while(ch=='y' || ch=='Y');
	out.close();

	ifstream in;

	in.open("jay4.txt",ios::binary);
	in.read((char*)&s2,sizeof(s2));
	cout<<endl<<"Roll NO "<<"Student Name "<<"Phone no"<<endl;
	while(in)
	{
		s2.showdata();
		in.read((char*)	&s2,sizeof(s2));

	}
	in.close();

	getch();


}