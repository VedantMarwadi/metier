/*program to check if the customer is eligble for free vouchers and if yes
 how many vouchers will the customer receive on the shopping amount spent by them*/
#include<stdio.h>
#include<conio.h>
void main()
{
	int amt,pdt1,pdt2,pdt3,ttlamt,dif;
	char ch;
	clrscr();
	printf("Enter the amount of total purchase made at Clothing, Jewelry and Footwear sections respectively");//total spent in clothing, jewelry and footwear section
	scanf("%d%d%d",&pdt1,&pdt2,&pdt3);
	ttlamt=pdt1+pdt2+pdt3;
	printf("Total of 3 products is Rupees %d\n",ttlamt);
	do
	{
		if (ttlamt>=10000)
		{
				printf("\nCongratulations!!! Your total purchase value is equal to or greater than Rs.10000.");
			if(ttlamt>=10000 && ttlamt<=10999)
			{
				printf("You are eligible for 1 free voucher");
				break;
			}
			if(ttlamt>=11000 )
			{
				printf("You are eligible for 2 free vouchers");
				break;
			}

		}
		else
		{
			printf("Your total purchase value is less than or not equal to Rs. 10000");
			dif=10000-ttlamt;
			printf("You are short by Rs. %d to get a free voucher", dif);
			do
			{
				printf("du u want to purchase(y/n)");
				fflush(stdin);
				scanf("%c",&ch);
				if(ch=='y' || ch=='Y')
				{
					printf("Enter amount");
					scanf("%d",&amt);
					ttlamt=ttlamt+amt;

					dif=10000-ttlamt;
					if(dif<0)
					{
						break;
					}
					else
					{

						printf("Your total purchase value is less than or not equal to Rs. 10000");
						printf("You are short by Rs. %d to get a free voucher", dif);
					}

				}
				else
				{
					break;
				}
			}
			while(ttlamt<10000);

		}
	}
	while(1);




	getch();
}


