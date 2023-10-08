import java.util.*;
class Rectangle
{
	float length,width;
	Rectangle(float length,float width)
	{
		this.length=length;
		this.width=width;
	}
	void calrectanglearea()
	{
		System.out.println("Area of rectangle is "+(length*width));
	}


}
class Cuboid extends Rectangle
{
	float height;
	Cuboid(float length,float width,float height)
	{
		super(length,width);
		this.height=height;
	}
	void calcuboidarea()
	{
			System.out.println("Area of cuboid is "+((2*length*width)+(2*length*height)+(2*height*width)));
	}

}
class four
{
	public static void main(String arg[])
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter length");
			float length=s.nextFloat();
			System.out.println("Enter width");
			float width=s.nextFloat();
			System.out.println("Enter height");
			float height=s.nextFloat();
			Cuboid c1=new Cuboid(length,width,height);
			c1.calrectanglearea();
			c1.calcuboidarea();

	}
}