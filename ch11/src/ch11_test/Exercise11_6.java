package ch11_test;

import java.util.*;

class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
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
		;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}	
	}
	
} // class Student

public class Exercise11_6 {
	static int getGroupCount(TreeSet tset, int from, int to) {
		int count = 0;
		Iterator<Student> it = tset.iterator();
		
		while(it.hasNext()) {
			Student stu = it.next();
	
			if(from <= stu.getAverage() && stu.getAverage() < to) 
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Student && o2 instanceof Student) {
					Student c1 = (Student)o1;
					Student c2 = (Student)o2;
					
					return c1.getAverage() > c2.getAverage() ? 1 : (c1.getAverage() == c2.getAverage() ? 0 : 1) * -1; 
				}
				
				return -1;
			}
		});
		
		set.add(new Student("홍길동",1,1,100,100,100)); 
		set.add(new Student("남궁성",1,2,90,70,80)); 
		set.add(new Student("김자바",1,3,80,80,90)); 
		set.add(new Student("이자바",1,4,70,90,70)); 
		set.add(new Student("안자바",1,5,60,100,80)); 
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("[60~69] :"+getGroupCount(set,60,70));
		System.out.println("[70~79] :"+getGroupCount(set,70,80));
		System.out.println("[80~89] :"+getGroupCount(set,80,90));
		System.out.println("[90~100] :"+getGroupCount(set,90,101));


	}

}
