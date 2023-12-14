import java.util.*;
class four
{
	float radius,area;
	public static final float PI=3.14f;
	four(float radius)
	{
			this.radius=radius;
			area=PI*radius*radius;
	}
	void displayarea()
	{
		System.out.println("Area of Circle is "+area);

	}
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius");
		float radius=s.nextFloat();
		four f1=new four(radius);
		f1.displayarea();

	}
}