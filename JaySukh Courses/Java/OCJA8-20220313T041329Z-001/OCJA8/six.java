class six
{
	int a;//instance variable
	String name;//instance variable
	boolean b;//instance variable
	double f;//instance variable
	char ch;//\u0000//instance variable
	static int count;//class variable or static variable


	void show()
	{
		//int a=45;
		int count=45;
		System.out.println("Instance Variable a "+a);
		//System.out.println("Local Variable a "+a);
		//System.out.println("Instatnce Variable "+this.a);
		//System.out.println(six.a);
		System.out.println(b);
		System.out.println(name);
		System.out.println(f);
		System.out.println(ch);//\u0000
		System.out.println("Local Variable count "+count);
		System.out.println("Static Variable count "+this.count);
		System.out.println("Static Variable count "+six.count);
	}
	public static void main(String arg[])
	{
		int a;//local variable
		//six s2;
		//a=78;
		six s1=new six();

		s1.show();
		//int b=a;
		//a=78;
		//System.out.println(a); //compilation error
		//System.out.println(six.a);
		//System.out.println(count); //compilation error
		//s2.show();
	}
}
