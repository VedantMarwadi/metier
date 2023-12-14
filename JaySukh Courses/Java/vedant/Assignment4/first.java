import java.util.*;
class Bicycle
{
	int gear,speed,increment_speed,decrement_speed;
	Bicycle(int gear,int speed,int increment_speed,int decrement_speed)
	{
		this.gear=gear;
		this.speed=speed;
		this.increment_speed=increment_speed;
		this.decrement_speed=decrement_speed;
	}
	void incrementspeed()
	{
		speed=speed+increment_speed;
	}
	void decrementspeed()
	{
		speed=speed-decrement_speed;
	}
	void display()
	{
		System.out.println("Gear "+gear);
		System.out.println("Speed "+speed);
		System.out.println("Increment Speed "+increment_speed);
		System.out.println("Decrement Speed "+decrement_speed);
	}

}
class Mountainbike extends Bicycle
{
	int seatheight;
	Mountainbike(int gear,int speed,int increment_speed,int decrement_speed,int seatheight)
	{
		super(gear,speed,increment_speed,decrement_speed);
		this.seatheight=seatheight;
	}
	void setseatheight(int seatheight)
	{
			this.seatheight=seatheight;
	}
	void display()
	{
		super.display();
		System.out.println("SearHeight "+seatheight);
	}
}
class first
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of gears");
		int gear=s.nextInt();
		System.out.println("Enter Speed");
		int speed=s.nextInt();
		System.out.println("Enter Speed increment");
		int speed_increment=s.nextInt();
		System.out.println("Enter Speed decrement");
		int speed_decrement=s.nextInt();
		System.out.println("Enter seat height");
		int seatheight=s.nextInt();
		Mountainbike m1=new Mountainbike(gear,speed,speed_increment,speed_decrement,seatheight);
		m1.display();
		System.out.println("Enter seat height to change");
		seatheight=s.nextInt();
		m1.setseatheight(seatheight);
		m1.display();


	}
}