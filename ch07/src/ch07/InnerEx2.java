package ch07;

public class InnerEx2 {
//	class InstanceInner{
//		int iv=100;
////		static int cv = 100; //static 변수를 선언할 수 없다.
//		final static int CONST = 100;
//	}
//	
//	static class StaticInner{
//		int iv = 200;
//		static int cv = 200;
//	}
//	
//	void myMethod() {
//		class LocalInner{
//			int iv = 300;
////			static int cv = 300;
//			final static int CONST = 300;
//		}
//		LocalInner lv = new LocalInner();
//	}
//	
//	InstanceInner iv = new InstanceInner();
//	static StaticInner cv = new StaticInner();
//	
//	static void staticMethod() {
//		//static 멤버는 인스턴스 멤버에 직접 접근할수 없다.
////		InstanceInner obj1 = new InstanceInner();
//		StaticInner obj2 = new StaticInner();
//		
//		//굳이 접근하려면 아래와 같이 객체를 생성해야 한다.
//		//인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
//		InnerEx2 outer = new InnerEx2();
//		InstanceInner obj1 = outer.new InstanceInner();
//	}
//	
//	void instanceMethod() {
//		//인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능하다.
//		InstanceInner obj1 = new InstanceInner();
//		StaticInner obj2 = new StaticInner();
////		LocalInner lv = new LocalInner();
//	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
