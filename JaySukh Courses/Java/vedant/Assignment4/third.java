import java.util.*;
class employee
{
	 int salary;
	String name;
	employee(int salary,String name)
	{
		this.salary=salary;
		this.name=name;
	}


}
class calsalary extends employee
{
	int bonus=3000;
	calsalary(int salary,String name)
	{
		super(salary,name);
	}
	void calsalarywithbonus()
	{
			System.out.println("Employee Name "+name);
			if(salary>60000)
			{
				System.out.println("Your salary is "+salary);
				System.out.println("Your bonus is "+bonus);
				System.out.println("Your Saalry with bonus is "+(salary+bonus));
			}
			else
				System.out.println("Salary "+salary);
	}
}
class third
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=s.nextLine();
		System.out.println("Enter Salary");
		int salary=s.nextInt();
		calsalary c1=new calsalary(salary,name);
		c1.calsalarywithbonus();
	}
}