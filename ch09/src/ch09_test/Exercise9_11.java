package ch09_test;

import java.util.Scanner;

public class Exercise9_11 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		
//		String input = scanner.nextLine();
		
		int input1 = 3;
		int input2 = 5;
		
		for(int i=input1; i<=input2; i++) {
			for(int j=1; j<10; j++ ) {
				System.out.printf("%d*%d=%d %n", i,j,i*j);
			}
			System.out.println();
		}
	}
}
