package com.com.rai;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

public class GetHour {

	int mail = 12;

	public static void main(String[] args) {
			boolean result = isValid();
			
			System.out.println(result);
	}

//	public String time(int hour) {
//		Calendar cal = Calendar.getInstance();
//		cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
//		cal.setTime(cal.getTime());
//		cal.add(Calendar.HOUR_OF_DAY, -hour);
//		SimpleDateFormat estformat = new SimpleDateFormat("HH");
//		return estformat.format(cal.getTime());
//	}

	public static boolean isValid(String ab, int bc) {
		
		if (null != ab && ab.length() > 0) {
			if (bc > 0) {
				
					return true;
			}
				 else {
					System.out.println("The list is empty");
				}
			} else {
				System.out.println("The integer is not positive");
			}
		return false;
	}

}
