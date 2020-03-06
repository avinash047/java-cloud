package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		String time = sdf.format(date);
		System.out.println("Time: "+time);

	}

}
