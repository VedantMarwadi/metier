package pack5;
import java.util.*;
public class patient
{
		public String name;
		public String address;
		public long mobileno;
		public String bloodgrp;
		public void getvalues()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Patient name");
			name=s.nextLine();
			System.out.println("Enter Address");
			address=s.nextLine();
			while(true)
			{
							System.out.println("Enter Blood Group");
							bloodgrp=s.nextLine().toUpperCase();
							boolean flag=false;
							switch(bloodgrp)
							{
								case "O+":
								case "O-":
								case "B+":
								case "B-":
								case "AB+":
								case "AB-":flag=true;
													break;
							}
							if(!flag)
									System.out.println("Please Enter valid Group");
							else
									break;
		   }
			System.out.println("Enter Mobile Number");
			mobileno=s.nextLong();



		}
		public void showvalues()
		{
			System.out.println("Patient Name "+name);
			System.out.println("Address "+address);
			System.out.println("Mobile Number "+mobileno);
			System.out.println("Blood Group "+bloodgrp);
		}


}
