package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateDemo2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
	}

}
