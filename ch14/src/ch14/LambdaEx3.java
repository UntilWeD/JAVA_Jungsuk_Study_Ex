package ch14;

@FunctionalInterface
interface MyFunction{
	void myMethod(); // public abstract void run();
}

class Outer{
	int val=10; // outer.this.val
	
	class Inner{
		int val = 20;
		
		void method(int i) { // void method(final int i){
			int val = 30; // final int val = 30;
//			i=10; // 에러 상수의 값을 변경할 수 없음
			
			MyFunction f= () -> {
				System.out.println(" i   :" +   i);
				System.out.println(" val :" + val);
				System.out.println(" this.val :" + ++this.val);
				System.out.println(" outer.this.val :" + ++Outer.this.val);
			};
			
			f.myMethod();
		}
	} // Inner클래스 끝
} // Outer클래스 끝

public class LambdaEx3 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner =  outer.new Inner();
		inner.method(100);
	}
}
