#include<iostream.h>
#include<conio.h>
#include<string.h>
class Student
{
	private:
	int rollno;
	char name[25];
	char address[50];
	long int phone;
	int maths,sci,eng,total;
	float per;
	char grade[20];
	public:
	void calgrade();
	void getdata();
	void getdata2(int,char[],char[],long,int,int,int);
	void getdata3();
	void showdata();

};

void Student:: calgrade()
{
	total=maths+sci+eng;
	per=total/3.0;
	if(per>=90)
		strcpy(grade,"A++");
	else if(per>=80)
		strcpy(grade,"A--");
	else if(per>=70)
		strcpy(grade,"B++");
	else if(per>=60)
		strcpy(grade,"B--");
	else if(per>=50)
		strcpy(grade,"C++");
	else if(per>=40)
		strcpy(grade,"C--");
	else
		strcpy(grade,"Fail");


}
void Student:: getdata()
{
	rollno=1;
	strcpy(name,"Jaysukh Patel");
	strcpy(address,"Naranpura");
	phone=35645645;
	maths=56;
	sci=78;
	eng=89;
}
void Student:: getdata2(int r,char n[],char a[],long p,int m,int s,int e)
{
	rollno=r;
	strcpy(name,n);
	strcpy(address,a);
	phone=p;
	maths=m;
	sci=s;
	eng=e;
}
void Student:: showdata()
{
	cout<<"Roll No = "<<rollno<<endl;
	cout<<"Name = "<<name<<"\n";
	cout<<"Address = "<<address<<endl;
	cout<<"Phone No = "<<phone<<endl;
	cout<<"Maths = "<<maths<<endl;
	cout<<"Science = "<<sci<<"\n";
	cout<<"English = "<<eng<<endl;
	cout<<"Total = "<<total<<endl;
	cout<<"Percentage = "<<per<<endl;
	cout<<"Grade = "<<grade<<"\n";
}
void Student::getdata3()
{
	cout<<"Enter Roll no";
	cin>>rollno;
	cout<<"Enter Name";
	cin>>name;
	cout<<"Enter Address";
	cin>>address;
	cout<<"Enter Phone";
	cin>>phone;
	cout<<"Enter Maths marks";
	cin>>maths;
	cout<<"Enter Science marks";
	cin>>sci;
	cout<<"Enter English marks";
	cin>>eng;
}

void main()
{
	clrscr();
	Student s1,s2,s3,s4,s5,s6;
	cout<<"Information of First two Students"<<endl;
	s1.getdata();
	s2.getdata();
	s1.calgrade();
	s2.calgrade();
	s1.showdata();
	s2.showdata();
	cout<<"Press any key to continu"<<endl;
	getch();

	cout<<"Information of third and forth Students"<<endl;
	s3.getdata2(10,"Kahan","Sahibag",645645,56,78,90);
	s4.getdata2(11,"Devang","Vejalpur",786767,76,87,98);
	s3.calgrade();
	s4.calgrade();
	s3.showdata();
	s4.showdata();
	cout<<"Press any key to continu"<<endl;
	getch();

	cout<<"Information of fifth and Sixth Students"<<endl;

	s5.getdata3();
	s6.getdata3();
	s5.calgrade();
	s6.calgrade();
	s5.showdata();
	s6.showdata();


	getch();

}
