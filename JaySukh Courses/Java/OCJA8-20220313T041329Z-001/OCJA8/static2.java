class static2
{
	int id;//instance variable
	static int count;//static variable or class variable

	void getdata()//instance method
	{

		count++;
		id=count;
	}
	void showdata()//instance method
	{
		System.out.println("Id "+id);
		System.out.println("Count "+count);
	}
	static void disp()//class method
	{
		System.out.println("common count for all objects "+count);
		static2 s1=new static2();
		s1.getdata();
		System.out.println("new object id "+s1.id);

	}
	void my()//instance method
	{
		disp();
		getdata();
	}
	public static void main(String arg[])
	{
		static2 s1=new static2();
		static2 s2=new static2();
		static2 s3=new static2();
		s1.getdata();
		s2.getdata();
		s3.getdata();
		s1.showdata();
		s2.showdata();
		s3.showdata();
		System.out.println("common count for all objects "+count);
		System.out.println("Individual id for individual objects "+s1.id);
		System.out.println("Individual id for individual objects "+s2.id);
		System.out.println("Individual id for individual objects "+s3.id);
		System.out.println("common count for all objects "+static2.count);
		System.out.println("common count for all objects "+s1.count);
		System.out.println("common count for all objects "+s2.count);
		System.out.println("common count for all objects "+s3.count);
		disp();
		static2.disp();
		s1.disp();
		s2.disp();
		s3.disp();
		System.out.println(s1.id+"\t"+s2.id+"\t"+s3.id);
		System.out.println("Last value of count "+count);
		s1.my();
		System.out.println("Last value of count "+count);
		System.out.println(s1.id);
		s2.my();
		System.out.println("Last value of count "+count);
		System.out.println(s2.id);

		s3.my();
		System.out.println("Last value of count "+count);
		System.out.println(s3.id);
		System.out.println(s1.id+"\t"+s2.id+"\t"+s3.id);

	}
}