package com.capgemini.threading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerDemo {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		System.out.println("Time: "+date+"\n"+sdf.format(date));

	}

}
