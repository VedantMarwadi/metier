class commandline3
{
	public static void main(String arg[])
	{
			String str=arg[0]+arg[1]+arg[2];
			System.out.println(str);

			int a=Integer.parseInt(arg[0]);
			int b=Integer.parseInt(arg[1]);
			int c=Integer.parseInt(arg[2]);
			int r=a+b+c;
			System.out.println("The addition is "+r);

			str="jay"+(19+10+78+89);
			System.out.println(str);

			str=19+10+78+89+"jay";
			System.out.println(str);

			str="jay"+19+10+78+89;
			System.out.println(str);

			str="jay"+true+56+56.78+56.78f+56L;
			System.out.println(str);

			str="jay"+true+(56+56.78+56.78f+56L);
			System.out.println(str);
			System.out.println(str.charAt(10));

			str=true+"jay"+(56+56.78+56.78f+56L);
			System.out.println(str);

			str="jay"+10*20/2;
			System.out.println(str);




	}
}