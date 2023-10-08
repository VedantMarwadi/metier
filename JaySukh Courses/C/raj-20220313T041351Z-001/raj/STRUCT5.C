#include<conio.h>
#include<stdio.h>
struct address
{
	char hno[10];
	char street[25];
	char area[25];
	char city[25];
	long int pin;
};

struct student
{
	int rollno;
	char name[25];
	struct address add;
	long int ph;
}s1;

/*struct student
{
	int rollno;
	char name[25];
	struct address
	{
		int hno;
		char street[25];
		char area[25];
		char city[25];
		long int pin;
	}add;
       struct marks
	{
		int maths,sci,eng,ss,dr;

	}m;
	long int ph;
};*/
void main()
{
	//struct student s1;

	clrscr();
	printf("Enter rollno name phoen no of student");
	scanf("%d%s%ld",&s1.rollno,s1.name,&s1.ph);
	printf("Enter address of student(hno,streetname,area,city,pincode)");
	scanf("%s%s%s%s%ld",s1.add.hno,s1.add.street,s1.add.area,s1.add.city,&s1.add.pin);

	printf("Rollno stuName      Phoeno     stuaddress\n");
	printf("%-7d%-12s%-11ld%s,%s,%s,%s-%ld\n",s1.rollno,s1.name,s1.ph,s1.add.hno,s1.add.street,s1.add.area,s1.add.city,s1.add.pin);
	getch();
}