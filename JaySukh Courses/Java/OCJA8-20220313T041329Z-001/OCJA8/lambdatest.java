import java.util.*;
interface validate//functional interface
{
	boolean check(Emp emp);

}
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
/*class salaryvalidate implements validate
{
	public boolean check(Emp emp)
	{
		return emp.getsalary()>=15000;
	}
}
class namevalidate implements validate
{
	public boolean check(Emp emp)
	{
		return emp.getname().startsWith("y");
	}
}
class prvalidate implements validate
{
	public boolean check(Emp emp)
	{
		return emp.getperfomancerating()>=5;
	}
}*/
class lambdatest
{
	public static void main(String arg[])
	{
		Emp e1=new Emp("jay",7,20000);
		Emp e2=new Emp("kiran",3,10000);
		Emp e3=new Emp("yash",8,25000);
		Emp e4=new Emp("nirav",2,3000);
		ArrayList<Emp> a1=new ArrayList<>();//diamond syntax//generic
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		//validate v1=new salaryvalidate();
		//validate v2=new prvalidate();
		//validate v3=new namevalidate();


		validate v1=e->e.getsalary()>=15000;
		validate v2=e->{return e.getperfomancerating()>=5;};
		//validate v2=e->(return e.getperfomancerating()>=5;);//no valid
		validate v3=(Emp e)->e.getname().startsWith("y");
		//validate v3=e->e.getname().startsWith("y");
		System.out.println("Based on Salary");
		filter(a1,v1);
		System.out.println("Based on Perfomance Rating");
		filter(a1,v2);
		System.out.println("Based on Name");
		filter(a1,v3);
	}
	public static void filter(ArrayList<Emp> a1,validate rule)
	{
		for(Emp e:a1)
		{
			if(rule.check(e))
				System.out.println(e);
		}
	}
}