import java.util.*;
interface bike
{
	void distance();
}
interface car
{
	void speed();
}
class vehicle implements bike,car
{
	public void distance()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter speed");
		float speed=s.nextFloat();
		float distance=speed*100;
		System.out.println("Distance "+distance);
		System.out.println("Speed "+speed);
	}
	public void speed()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Distance");
		float distance=s.nextFloat();
		float speed=distance/100;
		System.out.println("Distance "+distance);
		System.out.println("Speed "+speed);
	}
}
class fifth
{
	public static void main(String arg[])
	{
		vehicle v1=new vehicle();
		v1.distance();
		v1.speed();
	}
}