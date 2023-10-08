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
	student()
	{
	     cout<<"I am constructer"<<endl;
	     rollno=10;
	     strcpy(name,"jay");
	     strcpy(address,"Ahmedabad");
	     phone=5654654;
	     maths=45;
	     sci=67;
	     eng=89;
	     total=0;
	     per=0.0;
	     strcpy(grade,"");

	}
	student(int r,char n[],char a[],long int p,int m,int s,int e)
	{
		rollno=r;
		strcpy(name,n);
		strcpy(address,a);
		phone=p;
		maths=m;
		sci=s;
		eng=e;
	}

	~student()
	{
		cout<<"Ia m destructer"<<endl;
	}

	/*void getdata()
	{
		rollno=10;
		strcpy(name,"jay");
		strcpy(address,"Ahmedabad");
		phone=5654654;
		maths=45;
		sci=67;
		eng=89;

	}*/
	void getinfo()
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
	/*void get(int r,char n[],char a[],long int p,int m,int s,int e)
	{
		rollno=r;
		strcpy(name,n);
		strcpy(address,a);
		phone=p;
		maths=m;
		sci=s;
		eng=e;


	}*/

	void showdata()
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
	void calgrade()
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


};
void main()
{
	clrscr();
	student s1,s2;


	//s1.showdata();
	//getch();
	//s1.getdata();
	//s2.getdata();
	s1.calgrade();
	s2.calgrade();
	s1.showdata();
	s2.showdata();
	getch();

	student s3(10,"jay","Maninagar",3453454,45,67,89);
	student s4(11,"Kiran","Isanpur",456546,56,78,85);

	s3.calgrade();
	s4.calgrade();
	s3.showdata();
	s4.showdata();
	getch();

	student s5,s6;
	s5.getinfo();
	s6.getinfo();
	s5.calgrade();
	s6.calgrade();
	s5.showdata();
	s6.showdata();
	getch();


}