package ch10_test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
		SimpleDateFormat result = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
		Date date = null;
		
		do {
			try {
				System.out.println("날짜를 " +pattern+ "의 형태로 입력해주세요.(입력예2007/05/11)");
				System.out.print(">>");
				String input = sc.nextLine();
				date = sdf1.parse(input);
				break;
			} catch (Exception e) {
				continue;
			}
		} while (true);

		System.out.println(result.format(date));
		
	}
}
