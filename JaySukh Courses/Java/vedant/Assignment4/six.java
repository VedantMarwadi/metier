import java.util.*;
class Vehicle
{
	String vehicletype;
	Vehicle(String vehicletype)
	{
		this.vehicletype=vehicletype;
	}

}
class Car extends Vehicle
{
	String brand;
	Car(String vehicletype,String brand)
	{
		super(vehicletype);
		this.brand=brand;
	}


}
class Maruti extends Car
{
	String Modelno;
	int speed;
	Maruti(String vehicletype,String brand,String Modelno,int speed)
	{
		super(vehicletype,brand);
		this.Modelno=Modelno;
		this.speed=speed;

	}
	void display()
	{
		System.out.println("Vehicle type "+vehicletype);
		System.out.println("Brand "+brand);
		System.out.println("Model No "+Modelno);
		System.out.println("Speed "+speed);
	}
}
class six
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Vehicle Type");
		String vehicletype=s.next();
		System.out.println("Enter Brand");
		String brand=s.next();
		System.out.println("Enter Model No");
		String Modelno=s.next();
		int speed;
		while(true)
		{
			System.out.println("Enter Speed (max speed 80kmh)");
			speed=s.nextInt();
			if(speed<=80)
					break;
		}
		Maruti m1=new Maruti(vehicletype,brand,Modelno,speed);
		m1.display();






	}
}