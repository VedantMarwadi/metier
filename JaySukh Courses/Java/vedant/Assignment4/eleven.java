import java.util.*;
class college
{
	String collegename;
	String address;
	String course;
	college(String collegename,String address,String course)
	{
			this.collegename=collegename;
			this.address=address;
			this.course=course;
	}


}
class fy extends college
{
	String studentname;
	int fees;
	fy(String collegename,String address,String course,String studentname,int fees)
	{
		super(collegename,address,course);
		this.studentname=studentname;
		this.fees=fees;
	}
	void display()
	{
		System.out.println("College Name "+collegename);
		System.out.println("College Address "+address);
		System.out.println("Course Name "+course);
		System.out.println("First Year Student Name "+studentname);
		System.out.println("Fees "+fees);
	}


}
class sy extends college
{
	String studentname;
	int fees;
	sy(String collegename,String address,String course,String studentname,int fees)
	{
			super(collegename,address,course);
			this.studentname=studentname;
			this.fees=fees;
	}
	void display()
		{
			System.out.println("College Name "+collegename);
			System.out.println("College Address "+address);
			System.out.println("Course Name "+course);
			System.out.println("Second Year Student Name "+studentname);
			System.out.println("Fees "+fees);
	}


}

class eleven
{
	public static void main(String arg[])
	{
			boolean flag=false;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter College Name");
			String collegename=s.nextLine();
			System.out.println("Enter College Address");
			String address=s.nextLine();
			String course;
			while(true)
			{
				System.out.println("Enter Course Name");
				course=s.nextLine();
				switch(course)
				{
					case "MBA":flag=true;
										  break;
					case "MSC IT":flag=true;
											break;

				}
				if(flag)
						break;

			}
			System.out.println("Enter whci year(fy or Sy)");
			String year=s.nextLine();
			System.out.println("Enter Student Name");
			String studentname=s.nextLine();
			System.out.println("Enter Fees");
			int fees=s.nextInt();
			if(year.equals("fy") || year.equals("FY"))
			{
				fy f1=new fy(collegename,address,course,studentname,fees);
				f1.display();
			}
			else if(year.equals("sy") || year.equals("SY"))
			{
				sy s1=new sy(collegename,address,course,studentname,fees);
				s1.display();
			}
			else
			{
				System.out.println("Invalid value");
			}

	}
}