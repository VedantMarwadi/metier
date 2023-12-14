
#include<iostream.h>
#include<conio.h>
class Feet
{
	int feet,inch;

	public:

	Feet()
	{
		feet=0;
		inch=0;
		cout<<"DEFAULT CONSTRUCTOR"<<endl;
	}
	Feet(int f,int i)
	{
		feet=f;
		inch=i;
		cout<<"PARAMETERISED CONSTRUCTOR"<<endl;
	}
	void showFeet()
	{
		cout<<feet<<":"<<inch<<endl;
	}
	Feet addFeet(Feet p1)
	{
		Feet temp;
		temp.inch=p1.inch+inch;
		temp.feet=temp.inch/12;
		temp.inch%=12;
		temp.feet=temp.feet+feet+p1.feet;
		return temp;
	}
	void addFeet(Feet p1,Feet p2)
	{
		inch=p1.inch+p2.inch;
		feet=inch/12;
		feet=p1.feet+p2.feet+feet;
	}
	Feet(Feet &f)
	{
		inch=f.inch;
		feet=f.feet;
		cout<<"COPY CONSTRUCTOR"<<endl;
	}
};

void main()
{
	clrscr();
	Feet f6;
	Feet f1(4,30);
	Feet f2(4,30);
	Feet f3=f1.addFeet(f2);
	f3.showFeet();
	getch();

	Feet f4;
	Feet f5(10,6);
	f6.addFeet(f4,f5);
	f6.showFeet();
	getch();

}
