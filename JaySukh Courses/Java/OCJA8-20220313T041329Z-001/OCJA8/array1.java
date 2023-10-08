import java.util.*;
class array1
{
	public static void main(String arg[])
	{
			int a[]={10,20,30,40,50};//single dimentional array first syntex
			int b[]=new int[5];//single dimentional array second syntex
			int x[]=new int[]{45,67,78,89,90};////single dimentional array third syntex

			int c[][]={
							{10,20,30},
							{40,50,60},
							{70,80,90}
							};
			int d[][]=new int[3][3];
			int y[][]=new int[][]{
										{10,20,30},
										{40,50,60},
										{70,80,90}
										};


			int e[][]={
								{10,20},
								{40,50,60},
								{70,80,90,100}
							};//zigzag array
			int f[][]=new int[3][];
			f[0]=new int[2];
			f[1]=new int[3];
			f[2]=new int[4];
			int z[][]=new int[][]
										{
											{10,20},
											{40,50,60},
											{70,80,90,100}
										};//zigzag array

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
			System.out.println("Enter 9 int values");
			for(i=0;i<f.length;i++)
			{
				for(j=0;j<f[i].length;j++)
				{
						f[i][j]=s.nextInt();
				}
			}
			System.out.println("first SDA");
			for(i=0;i<a.length;i++)
			{
					System.out.print(a[i]+"\t");

			}
			System.out.println("\nsecond SDA");
			for(i=0;i<b.length;i++)
			{
					System.out.print(b[i]+"\t");

			}
			System.out.println("\nthird SDA");
			for(i=0;i<x.length;i++)
			{
					System.out.print(x[i]+"\t");

			}
			System.out.println("\nfirst TDA");
			for(i=0;i<c.length;i++)
			{
				for(j=0;j<c[i].length;j++)
				{
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("\nsecond TDA");
			for(i=0;i<d.length;i++)
			{
					for(j=0;j<d[i].length;j++)
					{
						System.out.print(d[i][j]+"\t");
					}
					System.out.println();
			}
			System.out.println("\nthird TDA");
			for(i=0;i<y.length;i++)
			{
						for(j=0;j<y[i].length;j++)
						{
							System.out.print(y[i][j]+"\t");
						}
						System.out.println();
			}
			System.out.println("\nzigzag array1");
			for(i=0;i<e.length;i++)
			{
						for(j=0;j<e[i].length;j++)
						{
							System.out.print(e[i][j]+"\t");
						}
						System.out.println();
			}
			System.out.println("\nzigzag array2");
			for(i=0;i<f.length;i++)
			{
					for(j=0;j<f[i].length;j++)
					{
						System.out.print(f[i][j]+"\t");
					}
			 		System.out.println();
			}
			System.out.println("\nzigzag array3");
			for(i=0;i<z.length;i++)
			{
						for(j=0;j<z[i].length;j++)
						{
								System.out.print(z[i][j]+"\t");
						}
						 System.out.println();
			}





	}
}