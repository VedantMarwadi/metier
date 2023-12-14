//to do the sum of arrray elements and find its average
//by using pointer
#include<stdio.h>
void main()
{
	int a[10],sum=0,i;
	int *p;
	float avg;
	clrscr();
	p=a;
	printf("Enter any 10 int values");
	for(i=0;i<10;i++)
	{
		printf("Enter value");
		scanf("%d",p+i);
		sum=sum+*(p+i);
	}
	printf("the sum of array element is %d\n",sum);

	avg=sum/10.0;
	printf("the average of array element is %.2f\n",avg);
	getch();

}