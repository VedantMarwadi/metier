import java.util.*;
abstract class Shape
{
	String shapename;
	public abstract void area();
	Shape(String shapename)
	{
		this.shapename=shapename;
	}


}
class Sphere extends Shape
{
	float radius;
	Sphere(String shapename,float radius)
	{
		super(shapename);
		this.radius=radius;
	}
	public  void area()
	{
		System.out.println("Area of  "+shapename+" is "+(4*3.14*radius*radius));
	}

}
class Cylinder extends Shape
{
	float radius,height;
	Cylinder(String shapename,float radius,float height)
	{
			super(shapename);
			this.radius=radius;
			this.height=height;
	}
	public  void area()
	{
		System.out.println("Area of  "+shapename+" is "+((2*3.14*radius*height)+(2*3.14*radius*radius)));
	}
}
class eight
{
	public static void main(String arg[])
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Radius of Sphere");
			float radius=s.nextFloat();
			Sphere s1=new Sphere("Sphere",radius);
			s1.area();
			System.out.println("Enter Radius of Cylinder");
			radius=s.nextFloat();
			System.out.println("Enter Height of Cylinder");
			float height=s.nextFloat();

			Cylinder c1=new Cylinder("Cylinder",radius,height);
			c1.area();
	}
}