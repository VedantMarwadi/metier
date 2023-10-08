import java.util.Scanner;
class Array
{
    int num[] = new int[10];
	Scanner sc=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter 10 numbers :");

        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
    }

    float sum()
    {
        //int num1[]=num;
        float sum = 0;

        for(int no:num)
        {
            sum += no;
        }
        return sum;
    }
    float avg()
	{
	        //int num1[]=num;
	        float sum = 0;

	        for(int no:num)
	        {
	            sum += no;
	        }
	        return sum/num.length;
    }


    void ascending_order()
    {
        //int num1[]=num;
        int temp;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]>num[j])
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

    }

    void descending_order()
    {
        //int num1[]=num;
        int temp;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]<num[j])
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

    }

    int maximum()
    {
        //int num1[]=num;
        int max=num[0];
        for(int i=1;i<num.length;i++)
        {
            if(max < num[i])
            {
                max = num[i];
            }

        }
        return max;
    }
    int minimum()
	 {
	        //int num1[]=num;
	        int min=num[0];
	        for(int i=1;i<num.length;i++)
	        {
	            if(min > num[i])
	            {
	                min = num[i];
	            }

	        }
	        return min;
    }

	int search()
	{
		int sear;
		boolean flag=false;
		//int num1[] = num;
		System.out.println("Enter number to search :");

        sear = sc.nextInt();
		int i=0;
		for(int no:num)
		{
			if(sear == no)
			{
				flag=true;
				break;
			}
			i++;
		}
		if(flag==true)
			return i ;
		else
			return -1;
	}
	void showarray()
	{
		for(int no:num)
		{
			System.out.println(no);
		}
		/*for(int i=0;i<num.length;i++)
		{
				System.out.println(num[i]);
		}*/
	}

    public static void main(String[] args)
    {
       Array arr =new Array();
       System.out.println("Original Array");
       arr.getdata();
       arr.showarray();
       System.out.println("Sum of Array"+arr.sum());
       System.out.println("Average of Array"+arr.avg());
       System.out.println("Array in Assecnding order");
       arr.ascending_order();
       arr.showarray();

	   System.out.println("Array in Dssecnding order");
       arr.descending_order();
       arr.showarray();
	   System.out.println("Maximum value from the array"+arr.maximum());
       System.out.println("Minimum value from the array"+arr.minimum());
       System.out.println("result of serch from array"+arr.search());

    }
}
