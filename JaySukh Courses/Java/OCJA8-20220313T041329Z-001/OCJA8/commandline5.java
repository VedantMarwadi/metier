//take one number from commnadline and print the sum of digit of that no
class commandline5
{
	int no;
	void getdata(int n)
	{
		no=n;
	}
	int sumofdigit()
	{
		int sum=0,temp,rem;
		temp=no;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		return sum;
	}
	public static void main(String arg[])
	{
		int no=Integer.parseInt(arg[0]);
		commandline5 c1=new commandline5();
		c1.getdata(no);
		int sum=c1.sumofdigit();
		System.out.println("The sum of digit is "+sum);
		System.out.println(c1.no);
		System.out.println(no);
	}
}