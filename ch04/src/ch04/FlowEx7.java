package ch04;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		System.out.print("가위 (1), 바위(2), 보(3)");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3) + 1;
				
		System.out.println("당신의" + user + "입니다.");
		System.out.println("컴의" + com + "입니다.");
		
		
		switch (user-com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 졌습니다.");
			break;
		default:
			break;
		}
	}

}
