package date;

import java.time.LocalDate;

public class DateDemo3 {

	public static void main(String[] args) {
		int day =9;
		int month=7;
		int year = 2000;
		
		LocalDate date = LocalDate.of(year, month, day);
		System.out.printf("%d/%d/%d",date.getDayOfMonth(),date.getMonthValue(),date.getYear());
		System.out.printf("\n%d/%s/%d",date.getDayOfMonth(),date.getMonth(),date.getYear());
	}

}
