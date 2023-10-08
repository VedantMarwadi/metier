class boxing
{
	public static void main(String arg[])
	{
		int a=10;
		Integer i1=new Integer(a);//boxing
		int b=i1.intValue();//unboxing
		System.out.println(i1);//toString() method of Integer class
		System.out.println(b);

		Integer i2=new Integer(10);
		int c=i1;//auto unboxing
		Integer i3=c;//auto boxing
		System.out.println(i3);//toString() method of Integer class
		System.out.println(c);


		int d=new Integer(5)+i1+10;
		System.out.println(d);
		Integer i4=new Integer(5)+10+i1;
		System.out.println(i4);//toString() method of Integer class


	}
}