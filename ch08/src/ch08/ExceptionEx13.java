package ch08;

public class ExceptionEx13 {

	public static void main(String[] args) {
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();
		}catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리 되었습니다.");
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
