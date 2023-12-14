import java.time.*;
public class LocalDateTime1
{
	public static void main(String arg[])
	{
		LocalDateTime dt=LocalDateTime.parse("2015-03-12T15:08:43");
		System.out.println(dt);
		LocalDateTime dt2=LocalDateTime.now();
		System.out.println(dt2);
		LocalDateTime dt3=LocalDateTime.of(2015,3,12,15,8,43);
		System.out.println(dt3);

		if(dt.getMonthValue()==3)
			System.out.println("Can't Invite the president");
		else
			System.out.println("Invite the president");





	}
}