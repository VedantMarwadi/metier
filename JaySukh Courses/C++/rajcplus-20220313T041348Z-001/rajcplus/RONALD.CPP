#include<iostream.h>
#include<conio.h>
#include<string.h>
class student
{

	int rollno;
	char name[25];
	char address[50];
	long int phone;
	int maths,sci,eng,total;
	float per;
	char grade[25];

	public:

	void getdata();
	void get(int,char[],char[],long int,int,int,int);
	void getinfo();
	void showdata();
	void calgrade();

};
void student:: getdata()
{
	rollno=10;
	strcpy(name,"jay");
	strcpy(address,"Ahmedabad");
	phone=5654654;
	maths=45;
	sci=67;
	eng=89;

}
void student:: getinfo()
{
	cout<<"Enter rollno";
	cin>>rollno;
	cout<<"Enter name";
	cin>>name;
	cout<<"Enter address";
	cin>>address;
	cout<<"Enter phoneno";
	cin>>phone;
	cout<<"Enter maths sci and eng marks respectively";
	cin>>maths>>sci>>eng;

}
void student::get(int r,char n[],char a[],long int p,int m,int s,int e)
{
	rollno=r;
	strcpy(name,n);
	strcpy(address,a);
	phone=p;
	maths=m;
	sci=s;
	eng=e;

}

void student::showdata()
{
       cout<<"Rollno = "<<rollno<<endl;
       cout<<"Name = "<<name<<endl;
       cout<<"Address = "<<address<<endl;
       cout<<"Phone No = "<<phone<<endl;
       cout<<"Maths = "<<maths<<endl;
       cout<<"Science = "<<sci<<endl;
       cout<<"English = "<<eng<<endl;
       cout<<"Total = "<<total<<endl;
       cout<<"Percentage = "<<per<<endl;
       cout<<"Grade = "<<grade<<endl;


}
void student::calgrade()
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

void main()
{
	clrscr();
	student s1,s2;
	s1.getdata();
	s2.getdata();
	s1.calgrade();
	s2.calgrade();
	s1.showdata();
	s2.showdata();
	/*s1.rollno=10;
	strcpy(s1.name,"kiran");
	strcpy(s1.address,"surat");
	s1.phone=56456;
	s2.rollno=20;
	strcpy(s2.name,"lalit");
	strcpy(s2.address,"baroda");
	s2.phone=56456657;  */
	//s1.showdata();
	//s2.showdata();
	/*cout<<"first student\n";
	cout<<"Rollno = "<<s1.rollno<<endl;
	cout<<"Name = "<<s1.name<<endl;
	cout<<"Address = "<<s1.address<<endl;
	cout<<"Phone No = "<<s1.phone<<endl;
	cout<<"second student"<<endl;
	cout<<"Rollno = "<<s2.rollno<<endl;
	cout<<"Name = "<<s2.name<<endl;
	cout<<"Address = "<<s2.address<<endl;
	cout<<"Phone No = "<<s2.phone<<endl;*/
	student s3,s4;
	s3.getinfo();
	s4.getinfo();
	s3.calgrade();
	s4.calgrade();

	s3.showdata();
	s4.showdata();
	student s5,s6;
	s5.get(123,"zarana","Usa",43564565,56,78,90);
	s6.get(124,"dhiren","UK",676784565,76,98,82);
	s5.calgrade();
	s6.calgrade();

	s5.showdata();
	s6.showdata();
	getch();


}