#include<iostream.h>
#include<conio.h>
#include<string.h>
template<class T1,class T2>class math2
{
	T1 a;
	T2 b;
	public:
	math2(T1 c,T2 d)
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
	math2<int,float> m1(23,45.56);
	math2<float,char> m2(34.56,'A');
	math2<char,char*> m3('A',"jay");
	math2<char*,int> m4("jay",56);
	math2<int,int> m5(78,78);

	m1.show();
	m2.show();
	m3.show();
	m4.show();
	m5.show();


	getch();
}