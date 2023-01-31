package ch02;

import java.util.*; // Scanner를 사용하기 위해 추가

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner클래스의 객체생성
		
		System.out.print("두자리 정수를 입력해주세요.>");
		String input = scanner.nextLine(); //입력받은 내용을 input에 저장
		int num = Integer.parseInt(input); // 입력받은내용을 int타입의 값으로 변환
		
		System.out.println("입력내용 :" +input);
		System.out.printf("num=%d%n", num);
		

	}

}
