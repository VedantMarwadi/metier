import java.time.*;
public class LocalDate1
{
	public static void main(String arg[])
	{
		LocalDate date1=LocalDate.of(2015,12,27);
		LocalDate date2=LocalDate.of(2015,Month.DECEMBER,27);
		LocalDate date3=LocalDate.now();
		LocalDate date4=LocalDate.parse("2015-02-27");//yyyy-mm-dd
		//LocalDate date5=LocalDate.of(2015,12,27);//DateTime Exception
		//LocalDate date6=LocalDate.parse("2015-12-02");//DateTimeParse Exception
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date4);
		//System.out.println(date5);
		//System.out.println(date6);

		/*LocalDate date1=LocalDate.of(2015,12,27);
		System.out.println(date1.getDayOfMonth());
		System.out.println(date1.getDayOfWeek());
		System.out.println(date1.getDayOfYear());
		System.out.println(date1.getMonth());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getYear());*/

		/*LocalDate shreybdate=LocalDate.parse("2002-08-30");
		LocalDate paulbdate=LocalDate.parse("2002-07-29");
		System.out.println(shreybdate.isAfter(paulbdate));
		System.out.println(shreybdate.isBefore(paulbdate));
		System.out.println(shreybdate.isAfter(shreybdate));*/

		/*LocalDate shreybdate=LocalDate.parse("2002-08-30");
		System.out.println(shreybdate.minusDays(10));
		System.out.println(shreybdate.minusMonths(2));
		System.out.println(shreybdate.minusWeeks(30));
		System.out.println(shreybdate.minusYears(1));
		System.out.println(shreybdate.plusDays(10));
		System.out.println(shreybdate.plusMonths(2));
		System.out.println(shreybdate.plusWeeks(30));
		System.out.println(shreybdate.plusYears(1));
		System.out.println(shreybdate.withDayOfMonth(1));
		System.out.println(shreybdate.withDayOfYear(1));
		System.out.println(shreybdate.withMonth(7));
		System.out.println(shreybdate.withYear(1));
		System.out.println(shreybdate);*/

		/*LocalDate interviewdate=LocalDate.parse("2016-02-28");
		System.out.println(interviewdate.atTime(16,20));//DateTimeException
		System.out.println(interviewdate.atTime(16,30,20));
		System.out.println(interviewdate.atTime(16,30,20,300));
		System.out.println(interviewdate.atTime(LocalTime.of(16,20)));*/

		/*LocalDate launchbook=LocalDate.parse("2016-02-08");
		LocalDate adate=LocalDate.parse("1970-01-08");
		System.out.println(launchbook.toEpochDay());
		System.out.println(adate.toEpochDay());*/

//1 jan-1970

	}
}