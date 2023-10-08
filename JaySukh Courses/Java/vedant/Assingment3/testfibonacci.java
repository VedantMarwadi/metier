package pack10;
import pack9.*;
class testfibonacci extends fibonacci
{
		void callfibonacci()
		{
			printvalues();
		}
		public static void main(String arg[])
		{
			testfibonacci f1=new testfibonacci();

			f1.printvalues();
		}
}
