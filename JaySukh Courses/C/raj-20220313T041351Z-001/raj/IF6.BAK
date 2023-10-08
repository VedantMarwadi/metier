//to find the total and percentage and grade of student
#include<stdio.h>  //it is pre processor directive
#include<conio.h>  //to incloude any file
void main()
{
	int maths,sci,eng,total;
	float per;
	clrscr();

	printf("\nEnter maths sci and eng marks respectively");
	scanf("%d%d%d",&maths,&sci,&eng);
	total=maths+sci+eng;
	per=total/3.0;
	printf("Maths = %d\nScience = %d\nEnglish = %d\n",maths,sci,eng);
	printf("Total = %d\nPercentage = %.2f\n",total,per);
	if(maths>=40 && sci>=40 && eng>=40)
	{
		if(per>=90)
			printf("A++");
		else if(per>=80)
			printf("A--");
		else if(per>=70)
			printf("B++");
		else if(per>=60)
			printf("B--");
		else if(per>=50)
			printf("C++");
		else
			printf("C--");
	}
	else
		printf("F");

	getch();

}