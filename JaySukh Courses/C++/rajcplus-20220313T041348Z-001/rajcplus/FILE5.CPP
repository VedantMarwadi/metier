#include<iostream.h>
#include<conio.h>
#include<fstream.h>
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
		cout<<"Roll no "<<rollno<<endl;
		cout<<"Name "<<name<<endl;
		cout<<"Phone no "<<ph<<endl;

	}
};
void main()
{
	ofstream out;
	clrscr();
	out.open("jay5.txt",ios::binary);
	student s1,s2;
	s1.getdata();
	out.write((char*)&s1,sizeof(s1));
	out.close();


	ifstream in;

	in.open("jay5.txt",ios::binary);
	in.read((char*)&s2,sizeof(s2));
	in.close();
	s2.showdata();
	getch();


}