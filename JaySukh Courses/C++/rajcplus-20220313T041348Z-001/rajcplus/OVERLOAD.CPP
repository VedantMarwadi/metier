//method overloading or function overloading
#include<iostream.h>
#include<conio.h>
class addition
{
	public:
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b, int c)
	{
		return a+b+c;
	}
	int add(int p,char q)
	{
		return p+q;
	}
	int add(char ch,int a)
	{
		return (ch+a);
	}
	float add(int a,float f,char ch)
	{
		return a+f+ch;
	}

} ;
void main()
{
	clrscr();
	addition a1;
	cout<<a1.add(10,20)<<endl;
	cout<<a1.add(10,20,30)<<endl;
	cout<<a1.add('a',10)<<endl;
	cout<<a1.add(10,45.50,'a')<<endl;
	getch();
}