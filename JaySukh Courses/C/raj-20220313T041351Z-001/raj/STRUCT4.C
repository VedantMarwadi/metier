#include<conio.h>
#include<stdio.h>
/*struct address
{
	int hno;
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
};
*/
struct student
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
	long int ph;
};
void main()
{
	struct student s[5];
	int no,i;
	char c[50],a[50];
	clrscr();
	for(i=0;i<5;i++)
	{
		printf("Enter rollno name phoen no of student");
		scanf("%d%s%ld",&s[i].rollno,s[i].name,&s[i].ph);
		printf("Enter address of student");
		scanf("%d%s%s%s%ld",&s[i].add.hno,s[i].add.street,s[i].add.area,s[i].add.city,&s[i].add.pin);
	}

	printf("Rollno\tstuName\tPhoeno\tstuaddress\n");
	for(i=0;i<5;i++)
	{
		printf("%d\t%s\t%ld\t%d,%s,%s,%s-%ld\n",s[i].rollno,s[i].name,s[i].ph,s[i].add.hno,s[i].add.street,s[i].add.area,s[i].add.city,s[i].add.pin);
	}
	do
	{
		printf("1. search city wise\n");
		printf("2. search area wise\n");
		printf("3. exit\n");
		printf("Enter your choice");
		scanf("%d",&no);
		if(no==3)
			break;
		else if(no==1)
		{
			printf("Enter city name");
			fflush(stdin);
			gets(c);
			for(i=0;i<5;i++)
			{
				if(strcmp(s[i].add.city,c)==0)
				{
				     printf("%d\t%s\t%ld\t%d,%s,%s,%s-%ld\n",s[i].rollno,s[i].name,s[i].ph,s[i].add.hno,s[i].add.street,s[i].add.area,s[i].add.city,s[i].add.pin);
				}
			}

		}
		else
		{
			printf("Enter area name");
			fflush(stdin);
			gets(a);
			for(i=0;i<5;i++)
			{
				if(strcmp(s[i].add.area,a)==0)
				{
				     printf("%d\t%s\t%ld\t%d,%s,%s,%s-%ld\n",s[i].rollno,s[i].name,s[i].ph,s[i].add.hno,s[i].add.street,s[i].add.area,s[i].add.city,s[i].add.pin);
				}
			}

		}
	}
	while(1);


	getch();
}