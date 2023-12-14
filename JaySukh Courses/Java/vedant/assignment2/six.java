import java.util.*;
class six
{
	float length,width;
	float area;
	six(float length)
	{
			this.length=length;
			area=length*length;
	}
	six(float length,float width)
	{
				this.length=length;
				this.width=width;
				area=length*width;
	}
	void displayarea()
	{
		System.out.println("Area is "+area);

	}
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of square");
		int length=s.nextInt();
		six s1=new six(length);
		s1.displayarea();
		System.out.println("Enter length and width of rectangle");
		length=s.nextInt();
		int width=s.nextInt();
		six s2=new six(length,width);
		s2.displayarea();


	}
}