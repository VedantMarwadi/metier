import java.util.*;
class object2
{
	int dd,mm,yy;
	object2(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public boolean equals(Object o)
	{

		object2 o1=(object2)o;//down casting
		if(dd==o1.dd && mm==o1.mm && yy==o1.yy)
			return true;
		else
			return false;

	}
	public int hashCode()
	{
		return dd^mm^yy;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	public static void main(String arg[])
	{
		object2 obj1=new object2(12,4,1978);
		object2 obj2=new object2(12,4,1978);



		if(obj1==obj2)//it compares reference
				System.out.println("both are equal");
		else
			    System.out.println("both are not equal");

		if(obj1.equals(obj2))//(Object--it compares reference
								//(object2---it compare contents)
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");


		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

		System.out.println(obj1);
		System.out.println(obj2);

		/*Integer i1=new Integer(10);
		i1=20;
		String s=i1.toString();
		System.out.println(i1);
		System.out.println(s);*/

	  	/*String str1="Jaysukh patel";//String literals
		String str3="Jaysukh patel";
		String str5="Jaysukh patel";
		String str2=new String("Jaysukh Patel");//String Objects
		String str4=new String("Jaysukh Patel");
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(str5);
		System.out.println(str2);
		System.out.println(str4);


		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str5.hashCode());


		System.out.println(str2.hashCode());
		System.out.println(str4.hashCode());

		Date d1=new Date();
		System.out.println(d1);*/

	/*	int a=new Integer(5)+5+i1;//auto unboxing
		System.out.println(a);
		Integer i2=5+new Integer(5)+i1;//auto boxing
		System.out.println(i2);*/








	}
}

