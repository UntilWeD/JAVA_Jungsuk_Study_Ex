package ch11_test;

import java.util.*;

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank; // 전교등수
	int classRank; // 반등수
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
	}
	
	int getTotal() {
		return total;
	}
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}
	
	public String toString() {
		return name
		+","+ban
		+","+no
		+","+kor
		+","+eng
		+","+math
		+","+getTotal()
		+","+getAverage()
		+","+schoolRank
		+","+classRank // 새로추가
		;
	}
} // class Student

class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Student stu1 = (Student)o1;
			Student stu2 = (Student)o2;
			return stu1.ban > stu2.ban ? 1 : (stu1.ban == stu2.ban ? stu1.compareTo(stu2) : -1);
		}
		return -1;
	}
}

public class Exercise11_9 {
	
	public static void calculateClassRank(List list) {
		//먼저 반별 총점기준 내림차순으로 정렬한다.
		Collections.sort(list, new ClassTotalComparator());
		
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i = 0; i< length; i++) {
			Student stu = (Student)(list.get(i));
			
			if(stu.ban != prevBan) {
				prevRank = 1;
				prevTotal = 1;
				stu.classRank = prevRank;
			} else if (stu.total == prevTotal) {
				stu.classRank = prevRank;
			} else if (stu.total != prevTotal) {
				stu.classRank = ++prevRank;
			}
			
			prevBan = stu.ban;
			prevTotal = stu.total;
			prevRank = stu.classRank;
		}
		
		
	}
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); 
		
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		
		Student stu = null;
		
		for(int i = 0; i< length; i++) {
			stu = (Student)(list.get(i));
			
			if(stu.getTotal() == prevTotal) {
				stu.schoolRank = prevRank;
			} else if (stu.getTotal() != prevTotal) {
				stu.schoolRank = i+1;
			}
			
			prevTotal = stu.getTotal();
			prevRank = stu.schoolRank;
		}
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Student("이자바",2,1,70,90,70)); 
		list.add(new Student("안자바",2,2,60,100,80)); 
		list.add(new Student("홍길동",1,3,100,100,100)); 
		list.add(new Student("남궁성",1,1,90,70,80)); 
		list.add(new Student("김자바",1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}
}
