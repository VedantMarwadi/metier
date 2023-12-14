class time
{
	int hrs,min,sec;
	void gettime(int h,int m,int s)
	{
		hrs=h;
		min=m;
		sec=s;
	}
	void showtime()
	{
		System.out.println(hrs+":"+min+":"+sec);
	}
	void addtime1(time p1,time p2)//object as a paramter
	{
			sec=p1.sec+p2.sec;
			min=sec/60;
			sec=sec%60;
			min=p1.min+p2.min+min;
			hrs=min/60;
			min=min%60;
			hrs=p1.hrs+p2.hrs+hrs;
	}
	time addtime2(time p2)//object as a return type and object as a parameter
	{
			time temp=new time();
			temp.sec=sec+p2.sec;
			temp.min=temp.sec/60;
			temp.sec=temp.sec%60;

			temp.min=min+p2.min+temp.min;
			temp.hrs=temp.min/60;
			temp.min=temp.min%60;

			temp.hrs=hrs+p2.hrs+temp.hrs;
			return temp;
	}
	void addtime3(int sec)
	{

	}
	void subtime(int sec)
	{

	}
	public static void main(String arg[])
	{
		time t1=new time();
		time t2=new time();
		time t3=new time();
		t1.gettime(2,34,45);
		t2.gettime(3,45,34);
		t3.addtime1(t1,t2);//object address

		t1.showtime();
		t2.showtime();
		t3.showtime();

		time t4=new time();
		time t5=new time();
		t4.gettime(3,45,23);
		t5.gettime(4,23,45);
		t3.addtime1(t4,t5);
		t3.showtime();


		time t6=t1.addtime2(t2);
		t6.showtime();

		t1.addtime3(100);
		t1.showtime();

		t1.subtime(100);
		t1.showtime();




	}
}