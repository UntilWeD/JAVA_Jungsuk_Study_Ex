package ch07_test;

class Outer {
	int value=10;
	class Inner {
		int value=20;
		
		void method1() {
			int value=30;
			Inner inner = new Inner();
			Outer outer = new Outer();
			System.out.println(value);
			System.out.println(inner.value);
			System.out.println(outer.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝


public class Exericise7_27 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer. new Inner();
		
		inner.method1();
	}
}
