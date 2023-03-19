package ch14_test;

import java.util.stream.Stream;

public class Exercise14_5 {
	public static void main(String[] args) {
		String[] strArr = { "aaa","bb","c", "dddd" };
		
		Stream<String> strStream = Stream.of(strArr);
		
		System.out.println("sum="+strStream.mapToInt(str -> str.length()).sum());
	}
}
