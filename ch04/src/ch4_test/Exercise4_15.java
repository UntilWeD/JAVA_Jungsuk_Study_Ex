package ch4_test;

public class Exercise4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0; // 변수 number를 거꾸로 해서 변환해서 담을 변수
	
		while(tmp != 0) {
			result += tmp%10 * Math.pow(10, String.valueOf(tmp).length()-1);
			tmp /= 10;
		}
		
		if(number == result)
			System.out.println( number + "는 회문수 입니다.");
		else
			System.out.println( number + "는 회문수가 아닙니다.");
	}

}
