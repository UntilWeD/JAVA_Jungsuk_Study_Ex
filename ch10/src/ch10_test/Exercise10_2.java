package ch10_test;

import java.util.*;
import java.text.*;

public class Exercise10_2 {
	
	static int paycheckCount(Calendar from, Calendar to) {
		int monDiff = 0;
		if(from == null || to == null)
			return 0;
		
		if(from == to && from.get(Calendar.DATE) == 21)
			return 1;
		
		int month1 = (from.get(Calendar.YEAR)*12) + from.get(Calendar.MONTH);
		int month2 = (to.get(Calendar.YEAR)*12) + to.get(Calendar.MONTH);
		monDiff = month2 - month1;
//		long difference = (to.getTimeInMillis() - from.getTimeInMillis())/1000;
//		monDiff = (int)(difference/(24*60));
		
		
		
		if(from.get(Calendar.DAY_OF_MONTH) <= 21 
				&& to.get(Calendar.DAY_OF_MONTH) >= 21) {
			monDiff++;
		}
		
		if(from.get(Calendar.DAY_OF_MONTH) > 21 
				&& to.get(Calendar.DAY_OF_MONTH) < 21) {
			monDiff--;
		}
		
		if(monDiff < 0)
			return 0;
		return monDiff;
	}

	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(sdf.format(fromDate)+" ~ "+sdf.format(toDate)+":");
		System.out.println(paycheckCount(from, to));
	}
	
	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2010,0,1);
		toCal.set(2010,0,1);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,21);
		toCal.set(2010,0,21);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,1);
		toCal.set(2010,2,1);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,1);
		toCal.set(2010,2,23);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,23);
		toCal.set(2010,2,21);
		printResult(fromCal, toCal);
		
		fromCal.set(2011,0,22);
		toCal.set(2010,2,21);
		printResult(fromCal, toCal);
		
	}
}
