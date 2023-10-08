#include<iostream.h>
#include<conio.h>
#include<string.h>
class Student
{
	int rollno;
	char name[25];
	char address[25];
	long int phone;
	int maths,sci,eng,total;
	float per;
	char grade[25];
	public:
	Student()
	{
		cout<<"I am constructer"<<endl;
		rollno=10;
		strcpy(name,"jaysukh");
		strcpy(address,"Maninagar");
		phone=1234567;
		maths=67;
		sci=89;
		eng=97;

	}
	Student(int r,char n[],char a[],long int p,int m,int s,int e)
	{
		cout<<"I am parameterised constructer"<<endl;
		rollno=r;
		strcpy(name,n);
		strcpy(address,a);
		phone=p;
		maths=m;
		sci=s;
		eng=e;
	}
	~Student()
	{
		cout<<"I am destructer"<<endl;
	}
	void getdata1();
	void getdata2();
	void getdata3(int,char[],char[],long int,int,int,int);
	void showdata();
	void calgrade();

};
void Student:: getdata2()
{
	cout<<"Enter rollno";
	cin>>rollno;
	cout<<"Enter name";
	cin>>name;
	cout<<"Enter  address";
	cin>>address;
	cout<<"Enter phoneno";
	cin>>phone;
	cout<<"Enter Maths marks";
	cin>>maths;
	cout<<"Enter Science marks";
	cin>>sci;
	cout<<"Enter  English marks";
	cin>>eng;

}

void Student:: calgrade()
{
	total=maths+sci+eng;
	per=total/3.0;
	if(per>=90)
		strcpy(grade,"A+");
	else if(per>=80)
		strcpy(grade,"A");
	else if(per>=70)
		strcpy(grade,"B+");
	else if(per>=60)
		strcpy(grade,"B");
	else if(per>=50)
		strcpy(grade,"C+");
	else if(per>=40)
		strcpy(grade,"C");
	else
		strcpy(grade,"F");
}
void Student::showdata()
{
	cout<<"Rollno "<<rollno<<endl;
	cout<<"Name "<<name<<endl;
	cout<<"Address "<<address<<endl;
	cout<<"Phone no "<<phone<<endl;
	cout<<"Maths "<<maths<<endl;
	cout<<"Science "<<sci<<endl;
	cout<<"English "<<eng<<endl;
	cout<<"Total "<<total<<endl;
	cout<<"Percentage "<<per<<endl;
	cout<<"Grade "<<grade<<endl;
}
void main()
{
	clrscr();
	Student s1,s2,s3,s4,s5,s6;
	/*s1.getdata1();
	s2.getdata1();
	s3.getdata2();
	s4.getdata2();*/
       Student s7(12,"hiren","satelite",346456,56,78,90);
	//s6.getdata3(13,"nirav","naranpura",5123356,65,87,56);

	s1.calgrade();
	s2.calgrade();
	s3.calgrade();
	s4.calgrade();
	s5.calgrade();
	s6.calgrade();
	s7.calgrade();
	s1.showdata();
	getch();


	s2.showdata();
	getch();

	s3.showdata();
	getch();
	s4.showdata();
	getch();
	s5.showdata();
	getch();
	s6.showdata();
	getch();
	s7.showdata();

	getch();


}