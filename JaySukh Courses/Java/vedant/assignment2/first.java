import java.util.*;
class first
{
	String college_name;
	String address;
	first()
	{
		college_name="K.S School Of Business Management";
		address="Ahmedabad";
	}
	void display()
	{
		System.out.println("College Name	:"+college_name);
		System.out.println("Address		:"+address);
	}
	public static void main(String arg[])
	{
			first f1=new first();
			System.out.println("College Name	:"+f1.college_name);//if it not private
			System.out.println("Address		:"+f1.address);//if it is not private
			f1.display();
	}
}