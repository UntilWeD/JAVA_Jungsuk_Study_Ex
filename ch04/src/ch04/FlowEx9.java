package ch04;

import java.util.Scanner;

public class FlowEx9 {

	public static void main(String[] args) {
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요.(1~100)>");
		
		Scanner scanner = new Scanner(System.in);
		int score  = scanner.nextInt();
		
		switch (score) {
		case 100: case 99: case 98: case 97: case 96:
		case 95:  case 94: case 93: case 92: case 91: case 90:
			grade = 'A';
 			break;
	    case 89: case 88: case 87: case 86: case 85:
	    case 84: case 83: case 82: case 81: case 80:
			grade = 'B';
			break;

		default:
			grade ='F';
			break;
		}
		System.out.println("당신의 학점은" + grade + "입니다.");
	}

}
