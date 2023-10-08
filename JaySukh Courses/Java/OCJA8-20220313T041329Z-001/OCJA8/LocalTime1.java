import java.time.*;
public class LocalTime1
{
	public static void main(String arg[])
	{
		/*LocalTime time1=LocalTime.of(16,30);
		LocalTime time2=LocalTime.of(16,30,30);
		LocalTime time3=LocalTime.of(16,30,20,656565);
		//LocalTime time4=LocalTime.of(23,34);//DateTimeException
		//LocalTime time5=LocalTime.of(1665654657,30,30);//compilation error
		LocalTime time6=LocalTime.now();
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		System.out.println(time6);*/




		/*LocalTime time4=LocalTime.now();
		LocalTime time5=LocalTime.parse("23:08:43");//(hh:MI:SS)DateTimeParseException
		System.out.println(time5);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIN.equals(LocalTime.MIDNIGHT));
		System.out.println(time4.getHour());
		System.out.println(time4.getMinute());
		System.out.println(time4.getSecond());
		System.out.println(time4.getNano());*/

		/*LocalTime shreyaftime=LocalTime.parse("17:09:04");
		LocalTime paulftime=LocalTime.parse("17:09:12");
		if(shreyaftime.isBefore(paulftime))
			System.out.println("Shreya Wins");
		else
			System.out.println("Paul Wins");

		if(shreyaftime.isAfter(paulftime))
			System.out.println("Paul Wins");
		else
			System.out.println("Shreya Wins");*/

		/*LocalTime moviestarttime=LocalTime.parse("21:00:00");
		int commutemin=35;
		LocalTime shreyastarttime=moviestarttime.minusMinutes(commutemin);
		System.out.println("Start by "+shreyastarttime+" from Office");*/

		/*int worldrecord=10;
		LocalTime racestarttime=LocalTime.parse("08:10:55");
		LocalTime raceendtime=LocalTime.parse("08:11:11");
		if(racestarttime.plusSeconds(worldrecord).isAfter(raceendtime))
			System.out.println("New World Record");
		else
			System.out.println("Try Harder");*/

		/*LocalTime starttime=LocalTime.parse("05:07:09");
		if(starttime.getMinute()<30)
			//starttime=starttime.withMinute(0);
			starttime.withMinute(0);
			//System.out.println(starttime.withMinute(0));
		System.out.println(starttime);*/

		/*LocalTime t1=LocalTime.parse("05:07:09");
		LocalDate d1=LocalDate.parse("2019-03-09");
		LocalDateTime dt=t1.atDate(d1);
		System.out.println(dt);*/



	}
}