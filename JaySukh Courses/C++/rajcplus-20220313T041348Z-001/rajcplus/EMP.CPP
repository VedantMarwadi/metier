#include<iostream.h>
#include<conio.h>
#include<string.h>
class employee
{
	int codeno;
	char name[25];
	char address[25];
	char dept[30];
	long int phone;
	int basicsalary;
	int tada,hra,pf,netsalary;
	public:
	void getdata();
	void getdata2(int,char[],char[],char[],long int,int);
	void getdata3();
	void calnetsalary();
	void showdata();

};
void employee:: getdata()
	{
	     codeno=1;
	     strcpy(name,"Jaysukh");
	     strcpy(address,"Naranpura");
	     strcpy(dept,"Hr");
	     phone=654545;
	     basicsalary=10000;
	}
void employee:: getdata2(int c,char n[],char a[],char d[],long int p,int bs)
	{
		codeno=c;
		strcpy(name,n);
		strcpy(address,a);
		strcpy(dept,d);
		phone=p;
		basicsalary=bs;
	}
void  employee::getdata3()
	{
		cout<<"Enter Code no";
		cin>>codeno;
		cout<<"Enter Name";
		cin>>name;
		cout<<"Enter Address";
		cin>>address;
		cout<<"Enter Phone no";
		cin>>phone;
		cout<<"Enter Departement";
		cin>>dept;
		cout<<"Enter Basic Salary";
		cin>>basicsalary;
	}
void employee:: calnetsalary()
	{
		tada=basicsalary*0.1;
		hra=basicsalary*0.15;
		pf=basicsalary*0.12;
		netsalary=basicsalary+tada+hra-pf;

	}
void employee:: showdata()
	{
		cout<<"Code no "<<codeno<<endl;
		cout<<"Name "<<name<<endl;
		cout<<"Address "<<address<<endl;
		cout<<"Department "<<dept<<endl;
		cout<<"Phone no "<<phone<<endl;
		cout<<"BasicSalary "<<basicsalary<<endl;
		cout<<"Tada "<<tada<<endl;
		cout<<"Hra "<<hra<<endl;
		cout<<"Pf "<<pf<<endl;
		cout<<"Netsalary "<<netsalary<<endl;



	}
void main()
{
	clrscr();
	employee e1,e2,e3;
	e1.getdata();
	e2.getdata2(10,"jay","Maninagar","production",435435,10000);
	e3.getdata3();
	e1.calnetsalary();
	e2.calnetsalary();
	e3.calnetsalary();
	e1.showdata();
	getch();
	e2.showdata();
	getch();
	e3.showdata();
	getch();
}