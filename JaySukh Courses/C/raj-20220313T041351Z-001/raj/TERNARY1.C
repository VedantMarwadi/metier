//use of ternary operator
#include<stdio.h>
#include<conio.h>
void main()
{
	char ch;
	int salary;
	clrscr();
	printf("Enter salary");
	scanf("%d",&salary);

	salary>=10000 ?  printf("High salary\n"):printf("Low Salary\n");

	ch=salary>=10000 ?  'H':'L';
	printf("%c\n",ch);

	if(salary>=10000)
		printf("High Salary");
	else
		printf("Low Salary");

	getch();

}