#include<iostream.h>
#include<conio.h>
void main()
{
	clrscr();
	int *p;
	int a=10;
	int &b=a;
	p=&a;
	cout<<"address of a "<<&a<<endl;
	cout<<"address of a "<<p<<endl;
	cout<<"value of a "<<a<<endl;
	cout<<"value of a "<<*p<<endl;
	cout<<"value of a "<<b<<endl;
	cout<<"address of p "<<&p<<endl;
	cout<<"address of b "<<&b<<endl;
	getch();

}