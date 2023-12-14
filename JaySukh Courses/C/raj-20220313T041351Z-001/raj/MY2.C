//multilication of matrix
#include<stdio.h>
#include<conio.h>
void main()
{
	int a[3][3],i,j,sum1=0,sum2=0;
	clrscr();
	printf("Enter values for first matrix");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}

	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d\t",a[i][j]);
		}
		printf("\n");
	}

	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			if((i+j)==2)
				sum1=sum1+a[i][j];
			if(i==j)
				sum2=sum2+a[i][j];

		}

	}
	printf("the sum of diagonal elements are %d\n",sum1);
	printf("the sum of diagonal elements are %d\n",sum2);



	getch();

}