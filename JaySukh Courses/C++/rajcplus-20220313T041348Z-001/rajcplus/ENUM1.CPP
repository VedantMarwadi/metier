//example of enum type
#include<iostream.h>
#include<conio.h>
enum color{red,green,blue};
//enum color{red=10,green,blue};  //gren=11,blue=12
//enum color{red,green=10,blue}; // 0,10,11
//enum color{red,green,blue=10}; // 0,1,10
//enum color{red=13,green=23,blue=34}; // gren=11,blue=12
enum boolean{false,true};

void main()
{
	enum color c1,c2,c3;
	enum boolean flag;
	clrscr();
	c1=red;
	c2=green;
	c3=blue;
	cout<<c1<<"\t"<<c2<<"\t"<<c3<<endl;

	//int a=c1+10;
	//cout<<a<<endl;

	//a=c1-10;
	//cout<<a<<endl;

	flag=true;

	//c1=67;
	//c2=89;
	//c3=90;
	if(flag)
		cout<<"It is is true";
	else
		cout<<"It is false";
	//cout<<c1<<"\t"<<c2<<"\t"<<c3<<endl;


	getch();
}