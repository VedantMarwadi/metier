import java.util.*;
import java.util.function.*;
/*class salaryvalidate implements Predicate<Emp>
{
	public boolean test(Emp e)
	{
		return e.getsalary()>=15000;
		//return true;
	}
}
class prvalidate implements Predicate<Emp>
{
	public boolean test(Emp e)
	{
		return e.getperfomancerating()>=5;
	}
}
class namevalidate implements Predicate<Emp>
{
	public boolean test(Emp e)
	{
		return e.getname().startsWith("y");
	}
}*/
class Emp
{
	String name;
	int perfomancerating;
	int salary;
	Emp(String n,int pr,int s)
	{
		name=n;
		perfomancerating=pr;
		salary=s;

	}
	String getname()
	{
		return name;
	}
	int getperfomancerating()
	{
		return perfomancerating;
	}
	int getsalary()
	{
		return salary;
	}
	public String toString()
	{
		return name+"\t"+perfomancerating+"\t"+salary;
	}
}
class lambdatest2
{
	public static void main(String arg[])
	{
		Emp e1=new Emp("jay",7,20000);
		Emp e2=new Emp("kiran",3,10000);
		Emp e3=new Emp("yash",8,25000);
		Emp e4=new Emp("nirav",2,3000);
		ArrayList<Emp> a1=new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		for(Emp e:a1)
		{
			System.out.println(e);
		}
		System.out.println("After deletion");
		//Predicate<Emp> v1=e->e.getname().startsWith("y");
		//System.out.println("Name");
		//a1.removeIf(e->e.getname().startsWith("y"));
		//System.out.println("Salary");
		//a1.removeIf(e->e.getsalary()>=15000);
		System.out.println("Perfomance rating");
		a1.removeIf(e->e.getperfomancerating()>=5);
		//System.out.println("Salary");
		//a1.removeIf(new salaryvalidate());

		//System.out.println("Perfomance rating");
		//a1.removeIf(new prvalidate());

		//System.out.println("Name");
		//a1.removeIf(new namevalidate());
		for(Emp e:a1)
		{
			System.out.println(e);
		}

	}

}

