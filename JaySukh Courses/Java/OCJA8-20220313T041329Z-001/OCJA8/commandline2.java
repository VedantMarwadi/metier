//take three numbers from commandline and find the maximum no
class commandline2
{
	public static void main(String arg[])
	{
			int max;
			int a=Integer.parseInt(arg[0]);
			int b=Integer.parseInt(arg[1]);
			int c=Integer.parseInt(arg[2]);
			if(a>b && a>c)
					max=a;
			else if(b>a && b>c)
					max=b;
			else
					max=c;
			System.out.println("The maximum is "+max);
		}
}

/*Integer---wrapper class
parseInt(string)---static method
int a=Integer.parseInt(any no in string format)
int a=Integer.parseInt("4565");
int a=Integer.parseInt("jay");no compilation error but run time error

Long---wrapper class
parseLong(string)---static method
long a=Long.parseLong(any long no in string format)
long a=Long.parseLong("4565L");
long a=Long.parseLong("jay");no compilation error but run time error

Float---wrapper class
parseFloat(string)---static method
float a=Float.parseFloat(any float no in string format)
float a=Float.parseFloat("4565.56f");
float a=Float.parseFloat("jay");no compilation error but run time error

Double---wrapper class
parseDouble(string)---static method
double a=Double.parseDouble(any double no in string format)
double a=Double.parseDouble("4565");
double a=Double.parseDouble("jay");no compilation error but run time error


*/