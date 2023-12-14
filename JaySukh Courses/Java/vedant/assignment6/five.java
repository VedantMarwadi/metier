import java.util.*;
class Student
{
	int marks[]=new int[3];
	void getvalues()
	{
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Maths Marks");
		marks[0]=s.nextInt();
		System.out.println("Enter Science Marks");
		marks[1]=s.nextInt();
		System.out.println("Enter English Marks");
		marks[2]=s.nextInt();
	}
	void findmaxmarks()
	{
		int max;
		if(marks[0]>marks[1] && marks[0]>marks[2])
			max=marks[0];
		else if(marks[1]>marks[0] && marks[1]>marks[2])
			max=marks[1];
		else
			max=marks[2];
		System.out.println("Maximum marks is "+max);

	}

}
class five
{
	public static void main(String arg[])
	{
		Student s1=new Student();
		s1.getvalues();
		s1.findmaxmarks();

	}
}