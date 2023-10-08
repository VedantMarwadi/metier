package pack3;
import java.util.*;
public class account
{
		public String acctype;
		public String accholdername;
		public long accno;
		public String ifsc;
		public void getvalues()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Account type(saving/current)");
			acctype=s.nextLine();
			System.out.println("Enter Account Holder Name");
			accholdername=s.nextLine();
			String str="";
			while(true)
			{
				System.out.println("Enter Account Number");
				str=s.nextLine();
				if(str.length()!=8)
					System.out.println("Enter valid account number of 8 digits only");
				else
					break;
			}
			accno=Long.parseLong(str);
			System.out.println("Enter IFSC Code");
			ifsc=s.nextLine();


		}
		public void showvalues()
		{
			System.out.println("Account Type "+acctype);
			System.out.println("Account Holder Name "+accholdername);
			System.out.println("Account Number "+accno);
			System.out.println("IFSC Code "+ifsc);
		}


}
