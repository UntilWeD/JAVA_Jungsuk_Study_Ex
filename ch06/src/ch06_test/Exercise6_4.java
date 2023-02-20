//package ch06_test;
//
//class Student{
//	String name;
//	int  ban;
//	int no;
//	int kor, eng, math;
//	
//	public int getTotal() {
//		int sum=kor+eng+math;
//		return sum;
//	}
//	
//	public float getAverage() {
//		float average = ((int)((getTotal()/3f+0.05)*10))/10f;
//		
//		return average;
//	}
//}
//
//public class Exercise6_4 {
//	public static void main(String[] args) {
//		Student s = new Student();
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		
//		System.out.println("이름:"+s.name);
//		System.out.println("총점:"+s.getTotal());
//		System.out.println("평균:"+s.getAverage());
//	}
//}
