package date;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo4 {

	public static void main(String[] args) {
		int day =2;
		int month=2;
		int year = 2018;
		
		LocalDate dob = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		
		Period period = Period.between(dob, today);
		//System.out.println(period);
		System.out.printf("year between %s and %s is = %d\n",dob,today,period.getYears());
		System.out.printf("Month between %s and %s is = %d\n",dob,today,period.getMonths());
		System.out.printf("Day between %s and %s is = %d\n",dob,today,period.getDays());
	}

}
