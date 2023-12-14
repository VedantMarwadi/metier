#include<iostream.h>
#include<conio.h>
#include<string.h>
class student
{
	int id;
	char name[25];
	char address[50];
	long phone;
	int maths,sci,eng,total;
	float per;
	char grade[4];
	public:

	void getdata()
	{
		id=1;
		//name="Jaysukh Patel";
		strcpy(name,"Jaysukh Patel");
		strcpy(address,"Naranpura");
		phone=435546456;
		maths=0;
		sci=0;
		eng=0;
	}
	void getdata2(int i,char n[],char a[],long p,int m,int s,int e)
	{
		id=i;
		strcpy(name,n);
		strcpy(address,a);
		phone=p;
		maths=m;
		sci=s;
		eng=e;
	}
	void getdata3()
	{
		cout<<"Enter id";
		cin>>id;
		cout<<"Enter name";
		cin>>name;
		cout<<"Enter Address";
		cin>>address;
		cout<<"Enter Phone no";
		cin>>phone;
		cout<<"Enter Marsk(Maths, Science and English) respectively";
		cin>>maths>>sci>>eng;


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
	void showdata()
	{
		cout<<"Student id is = "<<id<<endl;
		cout<<"Student Name is = "<<name<<endl;
		cout<<"Student Address is = "<<address<<endl;
		cout<<"Student Phone No is = "<<phone<<endl;
		cout<<"Maths marks is = "<<maths<<endl;
		cout<<"Science marks is = "<<sci<<endl;
		cout<<"English marks is = "<<eng<<endl;
		cout<<"Total is = "<<total<<endl;
		cout<<"Percentage is = "<<per<<endl;
		cout<<"Grade is = "<<grade<<endl;


	}
};
void main()
{
	clrscr();
	student s1,s2,s3,s4,s5,s6;

	s1.getdata();
	s2.getdata();
	s1.calgrade();
	s2.calgrade();
	s1.showdata();
	cout<<"Press any key to continue"<<endl;
	getch();

	s2.showdata();
	cout<<"Press any key to continue"<<endl;
	getch();

	s3.getdata2(10,"Neel Patel","Naranpura",34534553,45,67,89);
	s4.getdata2(11,"Nirav Patel","Satelite",45645664,87,89,84);
	s3.calgrade();
	s4.calgrade();

	s3.showdata();
	cout<<"Press any key to continue"<<endl;
	getch();

	s4.showdata();
	cout<<"Press any key to continue"<<endl;
	getch();


	s5.getdata3();
	s6.getdata3();
	s5.calgrade();
	s6.calgrade();

	s5.showdata();
	cout<<"Press any key to continue"<<endl;
	getch();

	s6.showdata();

	getch();

}