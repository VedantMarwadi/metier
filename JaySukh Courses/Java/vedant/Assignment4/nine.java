import java.util.*;
abstract class employee
{
	String name;
	float salary;
	employee(String name,float salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public abstract void calsalary();


}
class manager extends employee
{
		float da=0.5f;
		float hra=0.005f;
		manager(String name,float salary)
		{
				super(name,salary);
		}
		public void calsalary()
		{
			System.out.println("Manager's basic Salary is "+salary);
			System.out.println("Manager's hra is "+(salary*hra));
			System.out.println("Manager's DA is "+(salary*da));
			System.out.println("Manager's net Salary is "+(salary+(salary*da)+(salary*hra)));
		}


}
class nine
{
	public static void main(String arg[])
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter name");
			String name=s.nextLine();
			System.out.println("Enter Salary");
			float salary=s.nextFloat();
			manager m1=new manager(name,salary);
			m1.calsalary();

	}
}