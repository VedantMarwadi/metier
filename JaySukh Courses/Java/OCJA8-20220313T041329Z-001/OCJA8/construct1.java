
//constructor overaloding
//import java.util.*;
class math
{
	int a,b;
	math()
	{
		a=0;
		b=0;
		System.out.println("without parameter  constructer");
	}

	math(int c,int d)
	{
		a=c;
		b=d;
		System.out.println("two paramterised constructer");
	}

	math(int c)
	{
		a=c;
		b=c;
		System.out.println("one paramterised constructer");
	}
	math(float c)
	{
		a=(int)c;//type casting
		b=(int)c;
		System.out.println("one float paramterised constructer");
	}
	void show()
	{
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	public String toString()
	{
		return "The value of a = "+a+"\nthe value of  b = "+b;
	}

}
class construct1
{
	public static void main(String arg[])
	{
			math m1=new math();
			math m2=new math();
			math m3=new math();

			math m4=new math(34,56);
			math m5=new math(45,12);

			math m6=new math(67);
			math m7=new math(23);

			math m8=new math(23.89f);
			//math m9=new math(23.89);//compilation error

			//math m10=new math(34,56,90);
		 	m1.show();
			m2.show();
			m3.show();
			m4.show();
			m5.show();
			m6.show();
			m7.show();
			m8.show();
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
			System.out.println(m4);
			System.out.println(m5);
			System.out.println(m6);
			System.out.println(m7);
			System.out.println(m8);

			Integer i1=new Integer(10);
			Integer i2=new Integer("10");
			//Integer i3=new Integer("Jaysukh patel");
			System.out.println(i1);
			System.out.println(i2);
			//System.out.println(i3);

			String s1=new String();
			String s2=new String("jaysukh patel");
			char ch[]={'j','a','y'};
			String s3=new String(ch);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);




	}
}