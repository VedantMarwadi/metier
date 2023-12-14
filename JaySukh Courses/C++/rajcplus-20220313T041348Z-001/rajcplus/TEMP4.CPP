#include<iostream.h>
#include<conio.h>
#include<string.h>
template<class T>class math1
{
	T a,b;
	public:
	math1(T c,T d)
	{
		a=c;
		b=d;
	}
	void show()
	{
		cout<<"a = "<<a<<endl;
		cout<<"b = "<<b<<endl;

	}
}

void main()
{
	clrscr();

	math1<int> m1(23,45);
	math1<float> m2(34.56,67.89);
	math1<char> m3('A','Z');
	math1<char*> m4("jay","kiran");
	m1.show();
	m2.show();
	m3.show();
	m4.show();


	getch();
}