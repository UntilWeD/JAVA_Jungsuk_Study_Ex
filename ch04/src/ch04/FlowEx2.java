package ch04;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		int input;
		
		System.out.printf("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 값을 tmp에 저장
		input = Integer.parseInt(tmp);
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input != 0) 
			System.out.println("입력하신 문자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다. ", input);
		
		
	
			
	
	}
}
