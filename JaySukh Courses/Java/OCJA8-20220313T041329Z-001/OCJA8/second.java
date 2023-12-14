class second
{
	int a;
	void setA(int p)
	{
		a=p;
	}
	void setObj(second p)
	{
		p.a=45;
	}
	void setObj2(second p)
	{
		System.out.println("inside method"+p.a);//45//0
		//p.a=78;
		p=new second();
		p.a=78;
		System.out.println("inside method"+p.a);//78//78
	}
	public static void main(String jay[])
	{
		second s1=new second();
		s1.a=10;
		System.out.println(s1.a);//10
		s1.setA(100);
		System.out.println(s1.a);//100
		second s2=new second();
		s2.a=11;
		System.out.println(s2.a);//11
		s1.setObj(s2);
		System.out.println(s2.a);//45
		s1.setObj2(s2);
		System.out.println(s2.a);//45
		//System.out.println(-27/-5);
		s1.setObj2(new second());

	//float f=45.67f;

	}
}