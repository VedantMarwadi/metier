#include<iostream.h>
#include<conio.h>
#include<string.h>
template<class T>class math1
{
	T a,b,c;
	public:
	math1(T,T,T);
	void show();
	T max()
	{
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else
			return c;

	}

};
template<class T> math1<T>::math1(T p,T q,T r)
{
	a=p;
	b=q;
	c=r;
}
template<class T> void math1<T>::show()
{
	cout<<"a = "<<a<<endl;
	cout<<"b = "<<b<<endl;
	cout<<"c = "<<c<<endl;
}

void main()
{
	clrscr();
	math1<int> m1(23,45,78);
	math1<float> m2(34.56,67.89,56.78);
	math1<char> m3('A','Z','n');
	math1<char*> m4("jay","kiran","lalit");
	m1.show();
	m2.show();
	m3.show();
	m4.show();
	cout<<m1.max()<<endl;
	cout<<m2.max()<<endl;
	cout<<m3.max()<<endl;
	cout<<m4.max()<<endl;



	getch();
}