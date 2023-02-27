package ch10_test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_6 {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date MyBirthday = null;
		Date today = new Date();
		
		try {
			MyBirthday = sdf1.parse("2000-04-04");
		} catch (Exception e) { }
		
		System.out.println("birth day ="+sdf1.format(MyBirthday));
		System.out.println("today     ="+sdf1.format(today));
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.setTime(MyBirthday);
		cal2.setTime(today);

		long difference = ((cal2.getTimeInMillis() - cal1.getTimeInMillis())/1000);
		
		System.out.println((difference/(24*60*60))+ " days");
	}
}
