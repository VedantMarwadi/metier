#include<conio.h>
#include<stdio.h>
struct student
{
	int rollno;
	char name[25];
	char add[25];
	long int ph;
}s1;
//typedef struct student stu;
void main()
{
	struct student s2;
	clrscr();
	printf("Enter rollno name address and phoen no of first student");
	scanf("%d%s%s%ld",&s1.rollno,s1.name,s1.add,&s1.ph);
	printf("Enter rollno name address and phoen no of second student");
	scanf("%d%s%s%ld",&s2.rollno,s2.name,s2.add,&s2.ph);

	printf("Rollno stuName         Phoeno     stuaddress\n");
	printf("%-7d%-16s%-11ld%-15s\n",s1.rollno,s1.name,s1.ph,s1.add);
	printf("%-7d%-16s%-11ld%-15s\n",s2.rollno,s2.name,s2.ph,s2.add);
	getch();
}