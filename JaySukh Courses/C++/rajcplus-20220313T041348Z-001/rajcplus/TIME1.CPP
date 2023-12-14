//object as a argument and object as a return type
#include<iostream.h>
#include<conio.h>
class time
{

	int hrs,min,sec;
	public:
	time()
	{
		hrs=0;
		min=0;
		sec=0;
		cout<<"default constructer"<<endl;
	}
	time(int hrs,int min,int sec)
	{
	      this->hrs=hrs;
	      this->min=min;
	      this->sec=sec;
	      cout<<"parameterised constructer"<<endl;
	}
	void showtime()
	{
		cout<<hrs<<":"<<min<<":"<<sec<<endl;
	}
	time addtime(time p)
	{
		time temp;
		temp.sec=p.sec+sec;
		temp.min=temp.sec/60;
		temp.sec=temp.sec%60;
		temp.min=p.min+min+temp.min;
		temp.hrs=temp.min/60;
		temp.min=temp.min%60;
		temp.hrs=p.hrs+hrs+temp.hrs;
		return temp;

	}
	void addtime2(time p1,time p2)
	{
		  sec=p1.sec+p2.sec;
		  min=sec/60;
		  sec=sec%60;
		  min=p1.min+p2.min+min;
		  hrs=min/60;
		  min=min%60;
		  hrs=p1.hrs+p2.hrs+hrs;

	}
	time(time &t)
	{
		hrs=t.hrs;
		min=t.min;
		sec=t.sec;
		cout<<"copy constructer"<<endl;
	}


};
void main()
{
	clrscr();
	time t3;
	time t2(3,43,28);
	time t1(2,34,45);
	t3.addtime2(t1,t2);
	t1.showtime();
	t2.showtime();
	t3.showtime();

       time t4=t1.addtime(t2);
       t1.showtime();
       t2.showtime();
       t4.showtime();

       t1.addtime3(100); //to add 100 seconds into t1 time
       t1.show();

       t1.addtime3(-100); //to mius 100 seconds from t1 time
       t1.show();



	getch();


}