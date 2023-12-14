class basic2
{
	void add(short s1,short s2)
	{
		System.out.println("short addition is "+(s1+s2));
	}
	/*void add(int s1,int s2)
	{
			System.out.println("int addition is "+(s1+s2));
	}*/

	public static void main(String arg[])
	{
		basic2 b1=new basic2();
		b1.add(34,56);
		short t1=10;
		short t2=20;
		b1.add(t1,t2);
	}
}