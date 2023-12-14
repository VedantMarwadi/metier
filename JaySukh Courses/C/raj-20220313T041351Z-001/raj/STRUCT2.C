//structure pointer
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
	struct student *s1,*s2;
	clrscr();
	printf("Enter rollno name address and phoen no of student");
	scanf("%d%s%s%ld",&s1->rollno,s1->name,s1->add,&s1->ph);
	printf("Enter rollno name address and phoen no of student");
	scanf("%d%s%s%ld",&s2->rollno,s2->name,s2->add,&s2->ph);

	printf("Rollno    stuName             StuAddress          Phoeno\n");
	printf("%-10d%-20s%-20s%-10ld\n",s1->rollno,s1->name,s1->add,s1->ph);
	printf("%-10d%-20s%-20s%-10ld\n",s2->rollno,s2->name,s2->add,s2->ph);


	getch();

}