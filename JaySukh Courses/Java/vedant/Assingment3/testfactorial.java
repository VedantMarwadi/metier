package pack2;
import java.util.*;
import pack1.factorial;
class testfactorial
{
		public static void main(String arg[])
		{
				Scanner s =new Scanner(System.in);
				System.out.println("Enter any Number");
				int no=s.nextInt();
				factorial f1=new factorial();
				System.out.println("Factorial is "+f1.findfactorial(no));
		}
}