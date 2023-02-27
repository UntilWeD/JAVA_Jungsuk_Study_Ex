package ch10_test;

import java.text.*;

public class Exercise10_3 {
	public static void main(String[] args) {
		String data =  "123,456,789.5";
		DecimalFormat df1 = new DecimalFormat("###,###.#");
		DecimalFormat df2 = new DecimalFormat("#########");
		DecimalFormat df3 = new DecimalFormat("#,####,####");
		
		try {
			Number num = df1.parse(data);
			double d = num.doubleValue();
			System.out.println("data:"+data);
			System.out.println("반올림:"+df2.format(d));
			System.out.println("만단위:"+df3.format(d));
		} catch (Exception e) { }

	}
}
