import java.util.*;
class third
{
	String name;
	int id;
	int salary;
	third(String name,int id,int salary)
	{
			this.name=name;
			this.id=id;
			this.salary=salary;
	}
	void display()
	{
		System.out.println("Name	:"+name);
		System.out.println("Id	:"+id);
		System.out.println("Salary	:"+salary);
	}
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=s.next();
		System.out.println("Enter Id");
		int id=s.nextInt();
		System.out.println("Enter Salary");
		int salary=s.nextInt();
		third t1=new third(name,id,salary);
		t1.display();

	}
}