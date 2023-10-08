#include<iostream.h>
#include<conio.h>
void main()
{
	clrscr();
	int a=10;//existing variable
	int &b=a;//reference variable
	a=20;
	cout<<a<<"\t"<<b<<endl;
	b=56;
	cout<<a<<"\t"<<b<<endl;
	getch();


}