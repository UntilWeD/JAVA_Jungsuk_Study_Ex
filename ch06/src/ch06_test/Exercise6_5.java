package ch06_test;

class Student{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	public int getTotal() {
		int sum=kor+eng+math;
		return sum;
	}
	
	public float getAverage() {
		float average = ((int)((getTotal()/3f+0.05)*10))/10f;
		
		return average;
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
}

public class Exercise6_5 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}
}
