package ch03;

public class OperatorEx7 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b); // c의 자료형은 byte로 -127 ~ +127이기 때문에 값 손실이 일어나게 된다.
		System.out.println(c);
	}

}
