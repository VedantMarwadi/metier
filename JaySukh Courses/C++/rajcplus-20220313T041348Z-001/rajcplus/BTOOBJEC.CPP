//basic to object
//parameterised constructer
#include<iostream.h>
#include<conio.h>
class time
{
	int hrs,min,sec;
	public:
	time(int no)
	{
		hrs=no/3600;
		no=no%3600;
		min=no/60;
		no=no%60;
		sec=no;

	}
	void show()
	{
		cout<<hrs<<":"<<min<<":"<<sec<<endl;
	}


};
void main()
{
	int a=3456;
	clrscr();
	time t1=8003;
	t1.show();
	time t2(a);
	t2.show();

	getch();

}