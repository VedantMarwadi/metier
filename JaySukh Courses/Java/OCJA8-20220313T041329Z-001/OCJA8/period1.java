import java.time.*;
public class period1
{
	public static void main(String arg[])
	{
		/*Period p1=Period.of(2,3,7);
		Period p2=Period.ofYears(2);
		Period p3=Period.ofMonths(3);
		Period p4=Period.ofWeeks(2);
		Period p5=Period.ofDays(45);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);*/
		/*Period p11=Period.of(-2,-3,-7);
		Period p22=Period.ofYears(-2);
		Period p33=Period.ofMonths(-3);
		Period p44=Period.ofWeeks(-2);
		Period p55=Period.ofDays(-45);
		System.out.println(p11);
		System.out.println(p22);
		System.out.println(p33);
		System.out.println(p44);
		System.out.println(p55);*/

		/*Period parse1=Period.parse("P5Y");
		Period parse2=Period.parse("p5y");
		Period parse3=Period.parse("P5y");
		Period parse4=Period.parse("p5Y");
		Period parse5=Period.parse("+p5y");
		Period parse6=Period.parse("p+5y");
		Period parse7=Period.parse("P5y1m2d");
		Period parse8=Period.parse("p9m");
		Period parse9=Period.parse("p60d");
		Period parse10=Period.parse("-p5w");

		System.out.println(parse1);
		System.out.println(parse2);
		System.out.println(parse3);
		System.out.println(parse4);
		System.out.println(parse5);
		System.out.println(parse6);
		System.out.println(parse7);
		System.out.println(parse8);
		System.out.println(parse9);
		System.out.println(parse10);*/

		/*LocalDate d1=LocalDate.of(2019,2,19);
		LocalDate d2=LocalDate.now();
		Period pd=Period.between(d1,d2);
		System.out.println(pd);*/

		/*LocalDate d1=LocalDate.of(2019,2,19);
		System.out.println(d1.plus(Period.ofDays(10)));
		System.out.println(d1.plus(Period.ofDays(-10)));
		LocalDateTime dt1=LocalDateTime.of(2051,1,31,14,18,36);
		System.out.println(dt1.plus(Period.ofMonths(1)));
		System.out.println(dt1.minus(Period.ofYears(-2)));
		System.out.println(dt1.minus(Period.ofWeeks(4)));*/

		/*Period parse7=Period.parse("P5y1m2d");
		System.out.println(parse7.getYears());
		System.out.println(parse7.getMonths());
		System.out.println(parse7.getDays());
		System.out.println(Period.of(0,0,23).isZero());
		System.out.println(Period.of(0,0,-23).isNegative());*/

		/*LocalDate bdate=LocalDate.of(2022,5,31);
		LocalDate now=LocalDate.now();
		Period pb=Period.of(0,0,10);
		if(bdate.minus(pb).isBefore(now))
			System.out.println("Time to send out reminders to friends");*/

		/*Period p10days=Period.of(0,0,10);
		Period p1month=Period.of(0,1,0);
		System.out.println(p10days.minus(p1month));
		System.out.println(p10days.minusDays(5));
		System.out.println(p10days.minusMonths(5));
		System.out.println(p10days.minusYears(5));*/

		/*Period p7=Period.of(2,12,10);
		System.out.println(p7.multipliedBy(2));
		System.out.println(p7.multipliedBy(-2));*/

		/*Period month5=Period.of(0,5,0);
		Period days10=Period.of(0,0,10);
		Period month10=Period.of(0,10,0);
		System.out.println(month5.plus(month10));
		System.out.println(days10.plusDays(5));
		System.out.println(days10.plusMonths(5));
		System.out.println(days10.plusYears(5));
		System.out.println(Period.of(12,5,40).toTotalMonths());*/





	}
}