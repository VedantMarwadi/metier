import java.util.*;
class student
{
	int id;
	String name;
	String address;
	long ph;
	int maths,sci,eng,total;
	float per;
	String grade;
	void getdata()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id");
		id=s.nextInt();
		System.out.println("Enter name");
		name=s.next();
		System.out.println("Enter address");
		address=s.next();
		System.out.println("Enter phone no");
		ph=s.nextLong();
		System.out.println("Enter maths marks");
		maths=s.nextInt();
		System.out.println("Enter Science marks");
		sci=s.nextInt();
		System.out.println("Enter English marks");
		eng=s.nextInt();
	}
	void getinfo(int i,String n,String a,long p,int m,int s,int e)
	{
		id=i;
		name=n;
		address=a;
		ph=p;
		maths=m;
		sci=s;
		eng=e;
	}
	void calgrade()
	{
		total=maths+sci+eng;
		per=total/3;
		if(per>=90)
			grade="A++";
		else if(per>=80)
			grade="A--";
		else if(per>=70)
			grade="B++";
		else if(per>=60)
			grade="B--";
		else if(per>=50)
			grade="C++";
		else if(per>=40)
			grade="C--";
		else
			grade="F";



	}
	void showdata()
	{
		//calgrade();
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Address "+address);
		System.out.println("Phone no "+ph);
		System.out.println("Maths "+maths);
		System.out.println("Science "+sci);
		System.out.println("English "+eng);
		System.out.println("Total "+total);
		System.out.println("Percentage "+per);
		System.out.println("Grade "+grade);


	}


}
class array2
{
	public static void main(String arg[])
	{
		//int []a[],b,c[];

		/*student s1,s2,s3;
		s1=new student();
		s2=new student();
		s3=new student();*/
		student s[]=new student[3];//It will create three student references only not the object
		//student s[]=new student[]{new student(),new student(),new student()};
		int i;
		for(i=0;i<s.length;i++)
		{
				s[i]=new student();//create an object
				s[i].getdata();
				s[i].calgrade();

		}
		for(i=0;i<s.length;i++)
		{
			s[i].showdata();

		}
		for(student s1:s)
		{
			s1.showdata();
		}





	}
}
