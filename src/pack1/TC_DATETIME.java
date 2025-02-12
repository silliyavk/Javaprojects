package pack1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;

public class TC_DATETIME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instant CT=Instant.now();
		System.out.println("Current time is:"+CT);
		
		LocalDate LD=LocalDate.now();
		System.out.println("Local date is:"+LD);
		LocalDate independence=LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println("Independence day is:"+independence);
		
		System.out.println("Today:"+LD);
		System.out.println("Tomorrow:"+LD.plusDays(1));
		System.out.println("Last Month:"+LD.minusMonths(1));
		System.out.println("Is Leap:"+LD.isLeapYear());
		System.out.println("Move to 27th of the month:"+LD.withDayOfMonth(27));
		
		
	}

}