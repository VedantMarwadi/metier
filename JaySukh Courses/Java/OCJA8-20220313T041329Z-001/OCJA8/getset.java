class emp
{
	 private int codeno;
	 private String name;
	 private String address;
	 private int salary;
	public int getcodeno()
	{
		return codeno;
	}
	public String getname()
	{
		return name;
	}
	public String getaddress()
	{
		return address;
	}
	public int getsalary()
	{
		return salary;
	}
	public void setcodeno(int c)
	{
		if(c>0)
			codeno=c;
		else
			System.out.println("code no should not be negative");
	}
	public void setname(String n)
	{
		name=n;
	}
	public void setaddress(String a)
	{
		address=a;
	}
	public void setsalary(int s)
	{
		if(s>0)
			salary=s;
		else
			System.out.println("Salary should not be negative");
	}


}
class getset
{
	public static void main(String arg[])
	{
		emp e1=new emp();

		/*e1.codeno=68;//set codeno
		e1.name="kiran";//set name
		e1.address="India";//set address
		e1.salary=25000;//set salary
		System.out.println(e1.codeno);//get codeno
		System.out.println(e1.name);//get name
		System.out.println(e1.address);//get address
		System.out.println(e1.salary);//get salary

		e1.codeno=-7678668;//set
		e1.name="kiran";
		e1.address="India";
		e1.salary=-250000;
		System.out.println(e1.codeno);//get
		System.out.println(e1.name);
		System.out.println(e1.address);
		System.out.println(e1.salary);*/

		e1.setcodeno(67);
		e1.setname("kiran");
		e1.setaddress("Ahmedabad");
		e1.setsalary(25000);

		System.out.println(e1.getcodeno());
		System.out.println(e1.getname());
		System.out.println(e1.getaddress());
		System.out.println(e1.getsalary());

		e1.setcodeno(-128);
		e1.setname("jay");
		e1.setaddress("surat");
		e1.setsalary(-45000);

		System.out.println(e1.getcodeno());
		System.out.println(e1.getname());
		System.out.println(e1.getaddress());
		System.out.println(e1.getsalary());
	}


}