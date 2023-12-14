import java.util.*;
class pattern
{
		void printpattern1()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter no of rows");
			int rows=s.nextInt();
			for(int i=1;i<=rows;i++)
			{
				for(int k=i;k<=rows;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}

		}
		void printpattern2()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter no of rows");
			int rows=s.nextInt();
			for(int i=rows;i>=1;i--)
			{
					for(int k=i;k<=rows;k++)
					{
							System.out.print(" ");
					}
					for(int j=1;j<=i;j++)
					{
								System.out.print(j+" ");
					}
					System.out.println();
			}


		}
		void printpattern3()
		{
			Scanner s=new Scanner(System.in);
						System.out.println("Enter no of rows");
						int rows=s.nextInt();
						for(int i=1;i<=rows;i++)
						{
							for(int k=i;k<=rows;k++)
							{
								System.out.print(" ");
							}
							for(int j=1;j<=i;j++)
							{
								System.out.print(j);
							}
							System.out.println();
						}


		}


		public static void main(String arg[])
		{
			pattern p1=new pattern();
			p1.printpattern1();
			p1.printpattern2();
			p1.printpattern3();
		}
}
