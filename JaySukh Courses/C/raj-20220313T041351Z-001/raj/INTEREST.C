//to find the simple interest
#include<stdio.h>  //it is pre processor directive
#include<conio.h>  //to incloude any file

void main()
{
	float amt,rate,duration,i,famt;
	clrscr();
	printf("Enter amount rate and duration  respectively");
	scanf("%f%f%f",&amt,&rate,&duration);
	i=(amt*rate*duration)/100;
	famt=amt+i;
	printf("Amount = %.2f\nRate = %.2f\nDuration = %.2f\n",amt,rate,duration);
	printf("Interest = %.2f\nfinal amount = %.2f",i,famt);

	getch();

}