//object to basic
//operator function
#include<iostream.h>
#include<conio.h>
class time
{
	int hrs,min,sec;
	public:
	time(int h,int m,int s)
	{
		hrs=h;

		min=m;

		sec=s;

	}
	void show()
	{
		cout<<hrs<<":"<<min<<":"<<sec<<endl;
	}
	operator int()
	{
		return (hrs*3600)+(min*60)+sec;
	}


};
void main()
{
	clrscr();
	time t1(2,13,23);
	time t2(0,57,36);
	int b=t1;
	cout<<b<<endl;
	int c=t2;
	cout<<c<<endl;

	getch();

}