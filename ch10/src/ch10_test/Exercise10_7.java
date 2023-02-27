package ch10_test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

public class Exercise10_7 {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal1 = Calendar.getInstance();
		try {
			cal1.setTime(sdf1.parse("2016-01-01"));
		} catch (Exception e) { }
		
		for(int i=1; i < 365; i++) {
			cal1.add(Calendar.DATE, 1);
			if(cal1.get(Calendar.YEAR) == 2016 && cal1.get(Calendar.MONTH) == 11
					&& cal1.get(Calendar.WEEK_OF_MONTH) == 5 && cal1.get(Calendar.DAY_OF_WEEK) == 3) {
				System.out.println(sdf1.format(cal1.getTime()));	
			}
		}

	}

}
