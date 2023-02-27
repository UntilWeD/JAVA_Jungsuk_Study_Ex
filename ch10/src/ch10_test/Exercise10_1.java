package ch10_test;

import java.text.*;
import java.util.*;

public class Exercise10_1 {
	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("은 F번째 E요일입니다."); 
	
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 0, 10);
		Date day = cal.getTime();
		
		for(int i =1; i < 365; i++) {
			if (cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) == 2 
					&& cal.get(Calendar.DAY_OF_WEEK) == 1) {
				System.out.print(sdf1.format(day));
				System.out.println(sdf2.format(day));
			}
			cal.add(Calendar.DATE, 1);
			day=cal.getTime();
		}
		
	}
}
