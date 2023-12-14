//sorting of an array in assending or dessending order
#include<stdio.h>
void sort(int[],int);
void main()
{
	int a[10],i;

	clrscr();
	printf("Enter any 10 int values");
	for(i=0;i<10;i++)
	{
		printf("Enter value");
		scanf("%d",&a[i]);

	}
	printf("\nbefore sorting\n");
	for(i=0;i<10;i++)
	{
		printf("%d\t",a[i]);
	}
	sort(a,10);
	printf("\nafter sorting\n");
	for(i=0;i<10;i++)
	{
		printf("%d\t",a[i]);
	}

}
void sort(int a[],int s)
{
	int i,j,temp;

	for(i=0;i<s;i++)
	{
		for(j=i+1;j<s;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;

			}
		}
	}
}