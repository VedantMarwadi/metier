//function overloading or method overloading
class shape
{
	public float area(float l,float w)
	{
		return l*w;
	}
	public float area(float r)
	{
		return 3.14f*r*r;
	}

	protected String area(float l,float w,float h)
	{
		return "float area  ofcube is "+(l*w*h);
	}
	protected String area(long l,long w,long h)
	{
			return "long area of cube is "+(l*w*h);
    }
	protected String area(int l,int w,int h)
	{
			return "int area of cube is "+(l*w*h);
	}



}
class funover
{
	public static void main(String arg[])
	{
		shape s1=new shape();
		float a=s1.area(2.3f,4.5f);
		System.out.println("area of rectangle is "+a);
		a=s1.area(3.4f);
		System.out.println("area of circle is "+a);
		String str=s1.area(2.3f,3.4f,4.5f);
		System.out.println(str);
		str=s1.area(2,3,4);
		System.out.println(str);
		str=s1.area(2l,3l,4l);
		System.out.println(str);

	}
}