
class vararg1
{
	void add(int a,int b)
	{
		System.out.println("two parameter"+(a+b));
	}
	void add(int a,int b,int c)
	{
			System.out.println("Three parameter"+(a+b+c));
	}
	void add(int...a)// varargs//You can pass any no of integers
	{
		int sum=0;
		for(int no:a)
		{
			sum=sum+no;
		}
		/*for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}*/
		System.out.println("any no of parameter"+sum);

	}
	void add(String str,int... a)
	{
			int sum=0;
			for(int no:a)
			{
				sum=sum+no;
			}
			//for(int i=0;i<a.length;i++)
				//	{
				//		sum=sum+a[i];
				//	}

			System.out.println(str+" any no of parameter"+sum);

	}
	void add(int[]...a)
	{
			int sum=0;
			for(int arr[]:a)
			{
				for(int no:arr)
				{
					sum=sum+no;
				}
			}
			//for(int i=0;i<a.length;i++)
			//{
			//	for(int j=0;j<a[i].length;j++)
			//	{
			//			sum=sum+a[i][j];
			//	}
			//}

			System.out.println("any no of array of integer parameter"+sum);

	}


	public static void main(String...arg)
	{
		vararg1 v1=new vararg1();
		v1.add(10,20);
		v1.add(10,20,30);
		v1.add(10,20,30,40);
		v1.add(10,20,30,40,50);
		v1.add(1,2,3,4,5,6,7,8,9,10,11);
		v1.add(12);
		//v1.add();
		v1.add("jay",45,67,89,90,34);
		v1.add("kiran",45,67);
		v1.add("jay",45,67,89,90,34,56,78,90);
		v1.add("kiran",45,67,12);
		v1.add("jay");
		int a[]={10,20};
		int b[]={10,20,30};
		int c[]={10,20,30,40};
		v1.add(a,b);
		v1.add(a,b,c);
		v1.add(a);
		v1.add(b);

		for(String s:arg)
		{
			System.out.println(s);
		}

	}

}