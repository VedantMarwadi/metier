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

	long int no;
	clrscr();
	student s2;
	ifstream in;
	in.open("jay4.txt",ios::binary);
	in.seekg(0,ios::end);
	long int fsize=in.tellg();
	long int recsize=sizeof(s2);
	cout<<"Record size is "<<recsize<<endl;
	long int noofrec=fsize/recsize;
	cout<<"There are "<<noofrec<<" records in the file"<<endl;
	cout<<"Enter which record do u want to display"<<endl;
	cin>>no;
	long int offset=(no-1)*recsize;
	in.seekg(offset,ios::beg);

	in.read((char*)&s2,sizeof(s2));
	s2.showdata();
	in.close();

	getch();


}