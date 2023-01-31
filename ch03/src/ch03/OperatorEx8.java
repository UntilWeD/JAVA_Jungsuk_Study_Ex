package ch03;

public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000; // 일백만
		int b = 2_000_000; // 이백만
		long c = a * b;    // 백만 곱하기 이백만은??
		
		System.out.println(c);
	}

}
