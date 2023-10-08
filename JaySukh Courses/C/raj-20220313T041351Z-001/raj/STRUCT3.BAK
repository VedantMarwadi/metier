//array of structure
#include<conio.h>
#include<stdio.h>
struct student
{
	int rollno;
	char name[25];
	char add[25];
	long int ph;
};

void main()
{
	int i;
	struct student s[3];
	clrscr();
	for(i=0;i<3;i++)
	{
		printf("Enter rollno name address and phoen no of student");
		scanf("%d%s%s%ld",&s[i].rollno,s[i].name,s[i].add,&s[i].ph);
	}

	printf("Rollno stuName        StuAddress     Phoeno\n");
	for(i=0;i<3;i++)
	{
		printf("%-7d%-15s%-15s%-15ld\n",s[i].rollno,s[i].name,s[i].add,s[i].ph);
	}
	getch();

}