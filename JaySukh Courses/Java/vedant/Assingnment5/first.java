import java.util.*;
interface polygon
{

	default void getperimeter(float base,float side1,float side2)
	{
		System.out.println("Perimeter of triangle is "+(base+side1+side2));
	}
	public abstract void getarea();

}
class triangle implements polygon
{
	float base,height,side1,side2;
	triangle(float base,float height,float side1,float side2)
	{
		this.base=base;
		this.height=height;
		this.side1=side1;
		this.side2=side2;
	}
	public void getarea()
	{
		System.out.println("Area of triangle is "+(base*height/2));
	}
}
class first
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base of trinagle");
		float base=s.nextFloat();
		System.out.println("Enter height of trinagle");
		float height=s.nextFloat();
		System.out.println("Enter first side of trinagle");
		float side1=s.nextFloat();
		System.out.println("Enter second side of trinagle");
		float side2=s.nextFloat();
		triangle t1=new triangle(base,height,side1,side2);
		t1.getarea();
		t1.getperimeter(base,side1,side2);



	}
}