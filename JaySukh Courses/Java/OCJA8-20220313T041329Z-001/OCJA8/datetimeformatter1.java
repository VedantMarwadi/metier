import java.time.*;
import java.time.format.*;
public class datetimeformatter1
{
	public static void main(String arg[])
	{
		/*DateTimeFormatter df1=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter df2=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter df3=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter df4=DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		DateTimeFormatter df5=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);//both date & time--medium
		DateTimeFormatter df6=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.SHORT);
		System.out.println(df1.format(LocalDate.now()));
		System.out.println(df2.format(LocalDate.now()));
		System.out.println(df3.format(LocalDate.now()));
		System.out.println(df4.format(LocalTime.now()));
		System.out.println(df5.format(LocalDateTime.now()));
		System.out.println(df6.format(LocalDateTime.now()));*/

		/*DateTimeFormatter df5=DateTimeFormatter.ISO_DATE;
		System.out.println(df5.format(LocalDate.now()));
		DateTimeFormatter df6=DateTimeFormatter.ISO_TIME;
		System.out.println(df6.format(LocalTime.now()));
		DateTimeFormatter df7=DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(df7.format(LocalDateTime.now()));*/

		/*DateTimeFormatter df1=DateTimeFormatter.ofPattern("YYYY MMMM d EEEE");
		System.out.println(df1.format(LocalDateTime.now()));*/

		/*LocalDate d1=LocalDate.of(2057,8,11);
		LocalTime t1=LocalTime.of(14,30,15);
		DateTimeFormatter df1=DateTimeFormatter.ofPattern("y");
		DateTimeFormatter df2=DateTimeFormatter.ofPattern("YYYY");
		DateTimeFormatter df3=DateTimeFormatter.ofPattern("Y M D");
		DateTimeFormatter df4=DateTimeFormatter.ofPattern("e");
		DateTimeFormatter df5=DateTimeFormatter.ofPattern("H h m s");
		DateTimeFormatter df6=DateTimeFormatter.ofPattern("'Time now :'HH m a");
		System.out.println(df1.format(d1));
		System.out.println(df2.format(d1));
		System.out.println(df3.format(d1));
		System.out.println(df4.format(d1));
		System.out.println(df5.format(t1));
		System.out.println(df6.format(t1));*/

		/*DateTimeFormatter df1=DateTimeFormatter.ofPattern("MM-yyyy-dd");
		LocalDate d1=LocalDate.parse("12-2057-03",df1);
		System.out.println(d1);*/








	}
}