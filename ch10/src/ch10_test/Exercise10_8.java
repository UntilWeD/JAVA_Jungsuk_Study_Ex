package ch10_test;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;

public class Exercise10_8 {
	public static void main(String[] args) {
		ZonedDateTime seoulTime = ZonedDateTime.now();
		ZoneId NewYorkId = ZoneId.of("America/New_York");
		ZonedDateTime NewYorkTime = ZonedDateTime.now().withZoneSameInstant(NewYorkId);
		
		Duration du = Duration.between(seoulTime, NewYorkTime);
		
		System.out.println(seoulTime);
		System.out.println(NewYorkTime);
		
		long sec1 = seoulTime.getLong(ChronoField.OFFSET_SECONDS);
		System.out.println("sec1="+sec1);
		long sec2 = NewYorkTime.getLong(ChronoField.OFFSET_SECONDS);
		System.out.println("sec2="+sec2);
		System.out.println("diff="+ (sec1-sec2)/(60*60) );
	}
}
