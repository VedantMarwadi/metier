#include<iostream.h>
#include<conio.h>
#include<string.h>
/*template<class T1,class T2,class T3>void  show(T1 a,T2 b,T3 c)
{
	cout<<a<<"\t"<<b<<"\t"<<c<<endl;
}*/
template<class T>void  show(T a,T b,T c)
{
	cout<<a<<"\t"<<b<<"\t"<<c<<endl;
}

void main()
{
	clrscr();
	/*show(34,'g',"jay");
	show(23.45,"jay",65);
	show("jay",34.56,78);
	show('f',45,74);*/
	show(34,56,78);
	show(10,20,30);
	show(12.34,45.67,78.90);
	show('a','b','c');
	show("jay","kiran","lalit");


	getch();
}