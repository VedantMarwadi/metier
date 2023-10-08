class this1
{
	int a,b;//instance variable//defualt value of int instance variable is 0
	this1(int a,int b)//local variable
	{
		this.a=a;
		this.b=b;
		//a=p;
		//b=q;
		//a=a;
		//b=b;

		System.out.println("constructer");
	}

	void show()
	{
		System.out.println("a ="+a);
		System.out.println("b ="+b);

	}
	public static void main(String arg[])
	{
		this1 t1=new this1(100,200);
		this1 t2=new this1(1000,2000);
		this1 t3=new this1(10,20);

		t1.show();
		t2.show();
		t3.show();



	}
}