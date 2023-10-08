#include<iostream.h>
#include<conio.h>
class A
{
	public:
	int a;
	void show()
	{
		a=10;
		cout<<"a = "<<a<<endl;
	}
};
class B:public	 A
{
	public:
	void disp()
	{
		a=20;
		show();
	}
};
void main()
{
	B b1;
	b1.disp();
	b1.a=30;
	b1.show();
}