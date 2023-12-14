#include<iostream.h>
#include<conio.h>
#include<iomanip.h>
void main()
{
	int a=456,b=12,c=5678;
	float f=34.56756;
	clrscr();
	cout.setf(ios::left);
	//cout.setf(ios::);
	cout.fill('*');
	cout.width(10);
	cout<<a;
	cout.width(10);
	cout<<b;
	cout.width(10);
	cout<<c<<endl;
	cout.width(10);

	cout.precision(4);
	cout<<f<<endl;

	getch();
}