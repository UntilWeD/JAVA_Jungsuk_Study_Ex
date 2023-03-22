package ch14_test;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class Exercise14_7 {
	public static void main(String[] args) {
		IntStream intStream1 = new Random().ints(6, 1, 50);
		
		intStream1.sorted().forEach(System.out::println);;
		
	}
}
