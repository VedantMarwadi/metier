//function overlaoding with template function
#include<iostream.h>
#include<conio.h>
#include<string.h>
void swap(int &a,int &b)
{
	int temp;
	temp=a;
	a=b;
	b=temp;
	cout<<"specific"<<endl;

}
template<class T>void  swap(T &a,T &b)
{
	T temp;
	temp=a;
	a=b;
	b=temp;
	cout<<"generic"<<endl;
}

void main()
{
	int a=10,b=20;
	float f1=45.67,f2=78.12;
	char c1='A',c2='Z';
	clrscr();
	cout<<"before swap"<<a<<"\t"<<b<<endl;
	cout<<"before swap"<<f1<<"\t"<<f2<<endl;
	cout<<"before swap"<<c1<<"\t"<<c2<<endl;
	swap(a,b);
	swap(f1,f2);
	swap(c1,c2);


	cout<<"after swap"<<a<<"\t"<<b<<endl;
	cout<<"after swap"<<f1<<"\t"<<f2<<endl;
	cout<<"after swap"<<c1<<"\t"<<c2<<endl;


	getch();
}