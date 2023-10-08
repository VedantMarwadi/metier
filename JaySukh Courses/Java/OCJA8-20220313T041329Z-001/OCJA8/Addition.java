//function overloading or method overloading
//method or function name must be same but parameter must different
	//no of parameter or type of paramter must be different
	//it is an example of static polymorphisum
class Addition
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
	public int add(int a,int b,int c,int d,int e)
	{
			return a+b+c+d+e;
	}
	public static void main(String arg[])
	{
		Addition a1=new Addition();
		int r=a1.add(10,20);
		System.out.println("Addition of two values are "+r);
		r=a1.add(10,20,30);
		System.out.println("Addition of three values are "+r);
		r=a1.add(10,20,30,40);
		System.out.println("Addition of four values are "+r);
		r=a1.add(10,20,30,40,50);
		System.out.println("Addition of five values are "+r);
	}
}