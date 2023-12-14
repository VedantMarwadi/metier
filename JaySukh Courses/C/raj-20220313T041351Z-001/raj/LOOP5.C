//calculator by using ladder if else
#include<stdio.h>  //it is pre processor directive
#include<conio.h>  //to incloude any file
void main()
{
	int a,b,c,no;
	clrscr();
	do
	{

	printf("Enter two values");
	scanf("%d%d",&a,&b);
		printf("1. Addition\n");
		printf("2. Subtraction\n");
		printf("3. Multiplication\n");
		printf("4. Division\n");
		printf("5. Modulus\n");
		printf("6. Exit\n");
		printf("\nEnter your choice\n");
		scanf("%d",&no);
		if(no==1)
		{
			c=a+b;
			printf("Addition is %d\n",c);
		}
		else if(no==2)
		{
			c=a-b;
			printf("Subtraction is %d\n",c);
		}
		else if(no==3)
		{
			c=a*b;
			printf("Multiplication is %d\n",c);
		}
		else if(no==4)
		{
			c=a/b;
			printf("Division is %d\n",c);
		}
		else if(no==5)
		{
			c=a%b;
			printf("Modulus is %d\n",c);
		}
		else if(no==6)
		{
			break;
		}
		else
		{
			printf("Invalid choice try again\n");
		}
	}
	while(1);
	getch();

}