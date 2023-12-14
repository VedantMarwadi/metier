import java.util.*;
class array3
{
	public static void main(String arg[])
	{
			int a[]={10,20,30,40,50};
			int b[]=new int[5];
			int c[][]={{10,20,30},{40,50,60},{70,80,90}};
			int d[][]=new int[3][3];
			int e[][]={{10,20},{40,50,60},{70,80,90,100}};
			int f[][]=new int[3][];
			f[0]=new int[2];
			f[1]=new int[3];
			f[2]=new int[4];
			Scanner s =new Scanner(System.in);
			int i,j;
			System.out.println("Enter five int values");
			for(i=0;i<b.length;i++)
			{
				b[i]=s.nextInt();
			}
			System.out.println("Enter 9 int values");
			for(i=0;i<d.length;i++)
			{
				for(j=0;j<d[i].length;j++)
				{
						d[i][j]=s.nextInt();
				}
			}
			System.out.println("Enter 9 int values for zagged array");
			for(i=0;i<f.length;i++)
			{
					for(j=0;j<f[i].length;j++)
					{
							f[i][j]=s.nextInt();
					}
			}

			System.out.println("first SDA");
			for(int no:a)
			{
					System.out.print(no+"\t");

			}
			System.out.println("\nsecond SDA");
			for(int no:b)
			{
					System.out.print(no+"\t");
			}
			System.out.println("\nfirst TDA");
			for(int arr[]:c)
			{
				for(int no:arr)
				{
					System.out.print(no+"\t");
				}
				System.out.println();
			}
			System.out.println("\nsecond TDA");
			for(int arr[]:d)
			{
					for(int no:arr)
					{
						System.out.print(no+"\t");
					}
					System.out.println();
			}
			System.out.println("\nfirst zagged TDA");
			for(int arr[]:e)
			{
					for(int no:arr)
					{
						System.out.print(no+"\t");
					}
					System.out.println();
			}
			System.out.println("\nsecond zagged TDA");
			for(int arr[]:f)
			{
					for(int no:arr)
					{
						System.out.print(no+"\t");
					}
					System.out.println();
			}



	}
}