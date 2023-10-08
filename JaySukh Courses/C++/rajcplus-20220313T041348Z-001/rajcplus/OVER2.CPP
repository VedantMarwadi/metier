//method overloading
#include<iostream.h>
#include<conio.h>

	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b, int c)
	{
		return a+b+c;
	}
	int add(char ch,int a)
	{
		return ch+a;
	}
	int add(int a,float f,char ch)
	{
		return a+f+ch;
	}


void main()
{
	clrscr();

	cout<<add(10,20)<<endl;
	cout<<add(10,20,30)<<endl;
	cout<<add('a',10)<<endl;
	cout<<add(10,45.50,'a')<<endl;
	getch();
}