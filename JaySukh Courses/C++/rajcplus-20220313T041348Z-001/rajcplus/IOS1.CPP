#include<iostream.h>
#include<conio.h>
#include<iomanip.h>
void main()
{
	int a=456,b=12,c=5678;
	float f=34.56756;
	float f2=45.57787877;
	clrscr();
	cout.setf(ios::left);
	cout<<setw(10)<<a<<setw(10)<<b<<setw(10)<<c<<endl;
	cout<<setw(10)<<setprecision(3)<<f<<endl;
	cout.setf(ios::right);
	cout.width(15);
	cout<<f2<<endl;

	getch();

}
//456           12        5678
//34.568


