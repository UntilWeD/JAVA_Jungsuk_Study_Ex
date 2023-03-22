package ch14_test;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_6 {
	public static void main(String[] args) {
		String[] strArr = { "aaa","bb","c", "dddd" };
		
		Stream<String> strStream = Stream.of(strArr);
		
		System.out.println(strStream.mapToInt(str -> str.length()).max().getAsInt());
		
	}
}
