package com.com.rai;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Cal {
	
	public static String getCurrentDate(int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("Texas"));
		cal.setTime(cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH, -day);
		SimpleDateFormat estFormat = new SimpleDateFormat("MM-dd-yyyy");
		return estFormat.format(cal.getTime());
	}

	public static void main(String[] args) {
		System.out.println("Lousy");
		
		System.out.println(getCurrentDate(10));
		
	}
}
