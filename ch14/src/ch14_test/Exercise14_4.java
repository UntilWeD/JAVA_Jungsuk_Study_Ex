package ch14_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_4 {

	public static void main(String[] args) {
		
		Stream<Integer> intStream = IntStream.rangeClosed(1, 6).boxed();
		
		intStream.flatMap(i -> Stream.of(1,2,3,4,5,6).map(i2 -> new int[] {i, i2}))
				 .filter(iArr -> iArr[0] + iArr[1] == 6)
				 .forEach(iArr -> System.out.println(Arrays.toString(iArr)));
		
		
	
	}

}
